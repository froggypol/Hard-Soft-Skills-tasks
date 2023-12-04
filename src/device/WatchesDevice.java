package device;

import manufacturer.Manufacturer;
import payment.PaymentProvider;

public class WatchesDevice extends AbstractDevice {

    private PaymentProvider paymentProvider;
    private Manufacturer manufacturer;

    public WatchesDevice(String id, PaymentProvider paymentProvider) {
        super(id);

        this.paymentProvider = paymentProvider;
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
