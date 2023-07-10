package org.example;

public class StopLight implements State {

    @Override
    public void handleState(TrafficLight trafficLight) {
        System.out.println("Traffic Light is Red. Stop!");
        trafficLight.setState(new GreenLight());
    }
}
