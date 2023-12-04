package adapter;

import device.EUCharger;
import device.USCharger;

public class UsChargeAdapterImpl implements EUCharger {

    private USCharger usCharger;

    public UsChargeAdapterImpl(USCharger usCharger) {
        this.usCharger = usCharger;
    }

    @Override
    public void chargeEUDevices() {
        System.out.println("adapting US charger to EU");
        usCharger.chargeUSDevices();
    }
}
