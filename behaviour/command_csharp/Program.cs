/*
    Command Design Pattern
    - Is a behaviorial design pattern that allows you to encapsulate a request as 
        an object, thereby decoupling the sender of the request from the receiver of the request 

    - It turns a request into a standable object, which can be used to parameterise clients with different 
    requests, queue or log requests, and support undoable operations 

*/

class Light { 
    public void TurnOn() { 

        Console.WriteLine("Light is on!!!!");
    }
}


interface ICommand {
    void Execute();

}

class ONSwitch: ICommand { 
    
    private Light light;


    public ONSwitch(Light light) {
        this.light = light;
    }

    public void Execute() { 
        light.TurnOn();
    }
}

class RemoteControl { 
    private ICommand command;

    public void SetCommand(ICommand command_) { 
        this.command = command_;

    }   


    public void PressButton() { 
        command.Execute();
    }
}


class Program { 
    
    static void Main() { 
        Light light = new Light();


        var switch_ = new ONSwitch(light);
        var remote = new RemoteControl();
        remote.SetCommand(switch_);

        remote.PressButton();
    }
}