package payment.impl;

import payment.PaymentProvider;

public class GoogleWalletPaymentProvider implements PaymentProvider {

    @Override
    public void pay() {
        System.out.println("paying with google wallet");
    }
}
