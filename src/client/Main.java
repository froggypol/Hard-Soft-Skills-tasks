package client;

import device.AbstractDevice;
import device.SmartphoneDevice;
import manufacturer.Manufacturer;
import manufacturer.impl.SmartphoneManufacture;
import manufacturer.impl.WatchesManufacturer;
import payment.PaymentProvider;
import payment.impl.AppleWalletPaymentProvider;
import payment.impl.GoogleWalletPaymentProvider;

public class Main {

    public static void main(String[] args) {

        Manufacturer watchesManufacturer = new WatchesManufacturer();
        Manufacturer smartphoneManufacturer = new SmartphoneManufacture();

        PaymentProvider appleWalletProvider = new AppleWalletPaymentProvider();
        PaymentProvider googleWalletProvider = new GoogleWalletPaymentProvider();

        AbstractDevice googleSmartphoneDevice = new SmartphoneDevice("Google phone",
                googleWalletProvider, smartphoneManufacturer);
        googleSmartphoneDevice.createDevice();
        googleSmartphoneDevice.pay();
        AbstractDevice googleWatchesDevice = new SmartphoneDevice("Google watches",
                googleWalletProvider, watchesManufacturer);
        googleWatchesDevice.createDevice();
        googleWatchesDevice.pay();

        AbstractDevice appleSmartphoneDevice = new SmartphoneDevice("IPhone",
                appleWalletProvider, smartphoneManufacturer);
        appleSmartphoneDevice.createDevice();
        appleSmartphoneDevice.pay();
        AbstractDevice appleWatchesDevice = new SmartphoneDevice("Apple watches",
                appleWalletProvider, watchesManufacturer);
        appleWatchesDevice.createDevice();
        appleWatchesDevice.pay();
    }

}
