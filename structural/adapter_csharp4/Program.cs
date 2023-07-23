


using System;

/*
    Adapter Design Pattern 
    - used to enable the collaboration between incompatible interfaces 
    - it allows objects with incompatible interface to work together by providing a wrapper or an intermediary object, 
        known as the Adapter, that translates one interface into another 



*/

namespace adapter_csharp4;

public interface TemperatureSensor { 
    double GetTemperature();
}


public class LegacyTemperatureSensor { 


    // Simulating temperature measurement logic 
    public double GetTemperature() { 
        Random random = new Random();

        return random.Next(0, 100) + random.NextDouble();
    }
}

public class TempSensorAdapter : TemperatureSensor {
    private LegacyTemperatureSensor legacyTemperature;


    public TempSensorAdapter(LegacyTemperatureSensor legacy) { 
        this.legacyTemperature = legacy;
        
    } 


    // Convert From Fahrenheit to Celcius
    double TemperatureSensor.GetTemperature() {
        double tempF = legacyTemperature.GetTemperature();
        double tempCelcius = (tempF - 32) * 5 / 9;
        return tempCelcius;

    }
}
// Client code using the Target Interface 
public class DisplayTemperature { 
    public void ShowTemperature(TemperatureSensor sensor) { 
        double temp = sensor.GetTemperature();
        Console.WriteLine($"Temperature: {temp} in Celcius");
    }
}


class Program {
    static void Main(string[] args) {
        LegacyTemperatureSensor legacy = new LegacyTemperatureSensor();
        TempSensorAdapter adapter = new TempSensorAdapter(legacy);
        DisplayTemperature display = new DisplayTemperature();

        Console.WriteLine("Hello WOrd!");


        display.ShowTemperature(adapter);

    }
}


