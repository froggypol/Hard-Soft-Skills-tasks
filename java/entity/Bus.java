package entity;

import abstractentities.AbstractTransport;

public class Bus implements AbstractTransport {

    @Override
    public void deliverPassengers() {
        System.out.println("Bus delivery");
    }
}
