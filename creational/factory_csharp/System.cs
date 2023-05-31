using System;


public interface IProduct { 
    void Operate();
}

public class ProductA : IProduct
{
    public void Operate()
    {
        Console.WriteLine("Product A is Operating!");
    }
}

public class ProductB: IProduct { 
    public void Operate() { 
        Console.WriteLine("Product B is Operating!");
    }
}

public class ProductFactory { 
    public IProduct CreateProduct(string type) { 
        if (type == "A") return new ProductA();
        else if (type == "B") return new ProductB();
        throw new ArgumentException("Invalid Product Type");
    }

}