package manufacturer.impl;

import manufacturer.Manufacturer;

public class WatchesManufacturer implements Manufacturer {

    @Override
    public void manufactureDevice() {
        System.out.println("creating watches at watches manufacturer");
    }
}
