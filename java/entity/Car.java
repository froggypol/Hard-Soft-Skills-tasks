package entity;

import abstractentities.AbstractTransport;

public class Car implements AbstractTransport {

    @Override
    public void deliverPassengers() {
        System.out.println("Car delivery");
    }
}
