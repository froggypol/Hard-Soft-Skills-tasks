package device.impl;

import device.USCharger;

public class USChargeImpl implements USCharger {

    @Override
    public void chargeUSDevices() {
        System.out.println("charging US devices");
    }
}
