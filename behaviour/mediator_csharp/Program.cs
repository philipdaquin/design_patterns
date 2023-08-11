// See https://aka.ms/new-console-template for more information
/**
    Mediator design pattern promotes loose coupling between components or objects in a 
    system by centralising communication nad interaction logic.

    It is used ot reduce the direct connections and dependencies between individual componentnts, 
    making the system more maintainable adn easier to extend 
*/

class User { 

    private ChatMediator Mediator;
    public string Name {get; private set;}
        public User(ChatMediator Mediator,string Name) { 

        this.Mediator = Mediator;
        this.Name = Name;
    } 

    public void SendMessage(string message) { 
        Mediator.SendMessage(message, this);

    }
    public void ReceiveMessage(string message) { 
        Console.WriteLine($"{message}");
    }

}


interface ChatMediator { 
    void AddUser(User user);
    void SendMessage(string message, User sender);
}

class Chat: ChatMediator { 
    private List<User> users = new List<User>();


    public void AddUser(User user) { 
        Console.WriteLine("Added user in the list");

        users.Add(user);
    }

    public void SendMessage(string message, User sender) { 
       foreach (var user in users) { 
         if (user != sender) { 
            user.ReceiveMessage(message);
         }
       }
    }

}

class Program { 
    static void Main(string[] args) { 
        Console.WriteLine("Hello world!");
        ChatMediator chat = new Chat();
        User user1 = new User(chat, "User1");
        User user2 = new User(chat, "User2");
        User user3 = new User(chat, "User3");

        chat.AddUser(user1);
        chat.AddUser(user2);
        chat.AddUser(user3);
        user1.SendMessage("Hello1sdfsdf");
        user2.SendMessage("Hello1sdasdas");
        user3.SendMessage("Hello2adasda");
        user1.SendMessage("Hello1sdasdas");

    }
}