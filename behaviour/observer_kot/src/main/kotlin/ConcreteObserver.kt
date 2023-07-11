class ConcreteObserver: Observer {
    override fun update(message: String) {
        println("Observer received the message: $message")
    }
}