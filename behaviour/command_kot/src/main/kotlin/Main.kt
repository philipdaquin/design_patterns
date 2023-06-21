

/*  Command Design Pattern
*   - Allows you to encapsulate a request as an object, thereby decoupling the sender of the request from the receiver
*
* */
fun main(args: Array<String>) {
    val light = Light()
    val turnOn = TurnOnCommand(light); val turnOff = TurnOFFCommand(light)
    val remoteControl = RemoteControl()

    remoteControl.setCommand(turnOff)
    remoteControl.pressButton()



    remoteControl.setCommand(turnOn)
    remoteControl.pressButton()
}