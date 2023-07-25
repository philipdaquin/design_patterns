using System;

/*
    State Design Pattern 
    - Allows an object to change its behaviour when its internal state changes 
    - Used to model the behaviour of an object in a way that it can transition between different 
    states at runtime while maintaining encapsulation and avoiding code duplication 
*/





public interface IState { 
    void HandleState(Context current);
}

public class StateA : IState { 
    public void HandleState(Context current) { 
        Console.WriteLine("State A is saying hello");
        current.ChangeState(new StateB());
    
    }
}

public class StateB: IState { 
    public void HandleState(Context current) { 
        Console.WriteLine("State B Is saying hello");
        current.ChangeState(new StateA());
    }
}





class Program { 
    static void Main() { 
        Context ctx = new Context();
        ctx.Request();
        ctx.Request();
    }
}