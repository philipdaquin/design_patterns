using System;


class Program { 
    static void Main(string[] args) { 
        ProductFactory factory = new ProductFactory();
        var productA = factory.CreateProduct("A");
        productA.Operate();


        var productB = factory.CreateProduct("B");
        productB.Operate();
    }
}