// See https://aka.ms/new-console-template for more information
// Console.WriteLine("Hello, World!");

namespace Singleton{
    public class Singleton { 
        private static Singleton instance;

        private Singleton() {}

        private static readonly object _lock = new object();

        public static Singleton GetIntance(string value) { 
            lock(_lock) {
                if (instance == null) { 
                    instance = new Singleton();
                }
            }
            return instance;
        }

        public string Value { get; set; }
    }

    class Program { 
        static void Main(string[] args) { 
            
            Singleton singleton = Singleton.GetIntance("Test");

            Console.WriteLine(singleton.Value);
        }
    }
}