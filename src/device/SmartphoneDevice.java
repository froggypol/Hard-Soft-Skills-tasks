package device;

import manufacturer.Manufacturer;
import payment.PaymentProvider;

public class SmartphoneDevice extends AbstractDevice {

    private PaymentProvider paymentProvider;
    private Manufacturer manufacturer;

    public SmartphoneDevice(String id, PaymentProvider paymentProvider, Manufacturer manufacturer) {
        super(id);

        this.paymentProvider = paymentProvider;
        this.manufacturer = manufacturer;
    }

    @Override
    public void pay() {
        paymentProvider.pay();
    }

    @Override
    public void createDevice() {
        manufacturer.manufactureDevice();
    }
}
