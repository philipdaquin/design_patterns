package org.example;

public class GreenLight implements State {
    @Override
    public void handleState(TrafficLight trafficLight) {
        System.out.println("Traffic Light is GO!!!");
        trafficLight.setState(new StopLight());
    }
}
