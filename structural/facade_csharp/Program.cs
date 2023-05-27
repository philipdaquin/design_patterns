
class SubSystemA { 
    public void operation() { 
        Console.WriteLine("Hello, World!");
    }
}
class SubSystemB { 
    public void operation() { 
        Console.WriteLine("Hello, World!");
    }
}
class SubSystemC { 
    public void operation() { 
        Console.WriteLine("Hello, World!");
    }
}

class Facade { 
    private SubSystemA systemA;
    private SubSystemB systemB;
    private SubSystemC systemC;


    public Facade() { 
        systemA = new SubSystemA();
        systemB = new SubSystemB();
        systemC = new SubSystemC();
    }

    public void Operation() { 
        Console.WriteLine("Facade Operation");
        systemA.operation();
        systemB.operation();
        systemC.operation();
    }
}

class Client { 
    static void Main(string[] args) { 
        Facade facade = new Facade();
        facade.Operation();
    } 
}

// See https://aka.ms/new-console-template for more information


