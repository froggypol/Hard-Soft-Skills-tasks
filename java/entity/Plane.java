package entity;

import abstractentities.AbstractTransport;

public class Plane implements AbstractTransport {

    @Override
    public void deliverPassengers() {
        System.out.println("Plane delivery");
    }
}
