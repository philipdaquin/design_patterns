package org.example;

public class YellowLight implements State{
    @Override
    public void handleState(TrafficLight trafficLight) {
        System.out.println("Traffic light is YELLOW, Prepare to stop.");
        trafficLight.setState(new StopLight());
    }
}
