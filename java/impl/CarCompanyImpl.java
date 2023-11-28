package impl;

import abstractentities.AbstractTransport;
import entity.Car;
import interf.TransportCompany;

public class CarCompanyImpl implements TransportCompany {
    @Override
    public AbstractTransport createTransport() {
        return new Car();
    }

}
