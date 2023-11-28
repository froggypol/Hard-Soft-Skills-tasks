package transport.manager;

import abstractentities.AbstractTransport;
import impl.BusCompanyImpl;
import impl.CarCompanyImpl;
import impl.PlaneCompanyImpl;
import interf.TransportCompany;

public class TransportManager {

    public static void main(String[] args) {
        TransportCompany planeCompany = new PlaneCompanyImpl();
        TransportCompany carCompany = new CarCompanyImpl();
        TransportCompany busCompany = new BusCompanyImpl();

        AbstractTransport car = carCompany.createTransport();
        car.deliverPassengers();

        AbstractTransport plane = planeCompany.createTransport();
        plane.deliverPassengers();

        AbstractTransport bus = busCompany.createTransport();
        bus.deliverPassengers();

    }

}
