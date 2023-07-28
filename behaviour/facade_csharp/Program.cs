// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


/*
    Facade design pattern
    - Used to provide a simple and unified interface to a complex system or set of classes

    - simplifies the usafe of a subsystem by providing a higher-level interface that shields the client
    code from the complexities and interactions of the underlying components

    - This way, the client code doesn't need to understand the internal workings of the system, and the 
    interaction becomes more straightforward
*/

public class SystemA { 
    public void OperationA() { 
        Console.WriteLine("Subsystem!: OperationA");
    }
}

public class SystemB { 
    public void OperationB() {
        Console.WriteLine("SystemB");
    }
}

public class SystemC { 
    public void OperationC() { 
        Console.WriteLine("System C");
    }
}


public class Subsystem { 
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Subsystem() { 
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();

    }

    public void RunAllOperation() { 
        systemA.OperationA();
        systemB.OperationB();
        systemC.OperationC();
    }




}



class FacadePattern  { 
    static void Main() { 
        var system = new Subsystem();
        system.RunAllOperation();
        Console.WriteLine("hello world");
    }
}