
public class NycFactory : PizzaFactory
{
    Pizza PizzaFactory.CreateIndian()
    {
        return new IndianPizza();
    }

    Pizza PizzaFactory.CreateNyc()
    {
        return new NycPizza();
    }
}