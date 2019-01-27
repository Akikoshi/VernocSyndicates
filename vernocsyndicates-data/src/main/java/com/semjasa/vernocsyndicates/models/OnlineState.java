package com.semjasa.vernocsyndicates.models;

public class OnlineState {

    private State state;

    public OnlineState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

enum State{
    Online, Offline
}
