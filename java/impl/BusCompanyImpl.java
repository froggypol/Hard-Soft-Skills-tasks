package impl;

import abstractentities.AbstractTransport;
import entity.Bus;
import interf.TransportCompany;

public class BusCompanyImpl implements TransportCompany {

    @Override
    public AbstractTransport createTransport() {
        return new Bus();
    }
}
