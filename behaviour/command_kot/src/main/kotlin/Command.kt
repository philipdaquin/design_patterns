interface Command {
    fun execute()
}

/*
*   in Java,
*
*   ```
*       public class TurnONCommand implements Command {
*           private Light light_;
*
*           public TurnONCommand(Light light) {
*               this.light_ = light
*           }
*       }
*
*   ```
*
*
*
* */
class TurnOnCommand(private val light: Light): Command {
    override fun execute() {
        light.turnON()
    }
}

class TurnOFFCommand(private val light: Light): Command {
    override fun execute() {

        light.turnOFF()
    }
}
