


/*
*   The Remote Control class acts as the invoker, which sets and triggers the command
* */
class RemoteControl {


    // Command | null
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }
    fun pressButton() {
        command?.execute()
    }
}