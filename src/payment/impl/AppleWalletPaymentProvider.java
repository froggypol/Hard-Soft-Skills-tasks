package payment.impl;

import payment.PaymentProvider;

public class AppleWalletPaymentProvider implements PaymentProvider {


    @Override
    public void pay() {
        System.out.println("paying with apple wallet");
    }
}
