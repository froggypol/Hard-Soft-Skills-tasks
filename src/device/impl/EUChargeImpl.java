package device.impl;

import device.EUCharger;

public class EUChargeImpl implements EUCharger {

    @Override
    public void chargeEUDevices() {
        System.out.println("EU charger in progress");
    }
}
