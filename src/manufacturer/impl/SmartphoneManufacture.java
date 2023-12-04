package manufacturer.impl;

import manufacturer.Manufacturer;

public class SmartphoneManufacture implements Manufacturer {

    @Override
    public void manufactureDevice() {
        System.out.println("creating smartphone at smartphone manufacturer");
    }
}
