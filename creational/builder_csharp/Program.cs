// See https://aka.ms/new-console-template for more information


    
public class Car { 
    public string Make { get; set; }
    public string Model { get; set; }
    public int Year { get; set; }

    public override string ToString()
    {
        return $"{Year} {Make} {Model}";
    }

}
namespace Builder { 

    // The builder interface specifies methods for creating the different 
    // parts of the product objects
    public interface ICarBuilder { 
        void SetMake(string make);
        void SetModel(string model);
        void SetYear(int year);

        Car GetCar();
    }


    // Builder 
    public class CarBuilder: ICarBuilder { 
        private Car car;

        public CarBuilder() { 
            this.car = new Car();
        }

        public void SetMake(string make) {
            car.Make = make;
        }
        public void SetModel(string model) {
            car.Model = model;
        }
        public void SetYear(int year) {
            car.Year = year;
        }

        public Car GetCar() { 
            return car;
        }
    }

    // Director 
    public class CarManufacturer { 
        public ICarBuilder builder;

        public CarManufacturer(ICarBuilder builder) { 
            this.builder = builder;       
        }

        public void ConstructCar() { 
            builder.SetMake("BMW");
            builder.SetModel("E series");
            builder.SetYear(2000);
        }

    }


    public class Client { 
        public static void Main() { 
            var builder = new CarBuilder();
            var manaufacturer = new CarManufacturer(builder);

            manaufacturer.ConstructCar();
            Car car = builder.GetCar();
            Console.WriteLine(car.ToString());
        }
    }

}
