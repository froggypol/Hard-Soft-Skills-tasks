package client;

import adapter.UsChargeAdapterImpl;
import device.EUCharger;
import device.USCharger;
import device.impl.EUChargeImpl;
import device.impl.USChargeImpl;

public class Main {

    public static void main(String[] args) {

        EUCharger euCharger = new EUChargeImpl();
        euCharger.chargeEUDevices();
        USCharger usCharger = new USChargeImpl();

        EUCharger usChargeAdapter = new UsChargeAdapterImpl(usCharger);
        usChargeAdapter.chargeEUDevices();
    }

}
