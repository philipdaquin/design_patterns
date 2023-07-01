


class User(
    private val name: String,
    private val mediator: ChatMediator
    ) {
    fun sendMessage(msg: String) {
        println("$name: Sending message - $msg")
        mediator.sendMessage(msg, this)
    }
    fun receiveMessage(msg: String) {
        println("$name: Received Message - $msg")
    }
}