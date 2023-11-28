package impl;
import abstractentities.AbstractTransport;
import entity.Plane;
import interf.TransportCompany;

public class PlaneCompanyImpl implements TransportCompany {

    @Override
    public AbstractTransport createTransport() {
        return new Plane();
    }

}
