
class ChatRoomMediator: ChatMediator {


    private val users = mutableListOf<User>()
    override fun sendMessage(message: String, user: User) {
        // Broadcast the message to all users except the sender
        users.filter { it != user }
            .forEach {
                it.receiveMessage(message)
            }
    }

    override fun addUser(user: User) {
        users.add(user)
    }


}