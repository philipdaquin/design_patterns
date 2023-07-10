package org.example;

public class TrafficLight {
    private State currentState;

    public TrafficLight() {
        this.currentState = new StopLight();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void changeState() {
        currentState.handleState(this);
    }

}
