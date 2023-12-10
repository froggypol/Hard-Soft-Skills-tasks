package observer.impl;

import customer.Customer;
import observer.SalePriceObserver;
import price.Price;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class SalePriceObserverImpl implements SalePriceObserver {

    private List<Customer> customers;

    public SalePriceObserverImpl() {
        customers = new ArrayList<>();
    }

    @Override
    public void provideSalePrice(Product product, double discount) {
        Price discountedPrice = new Price(product.getPrice().getValue() * discount / 100);
        product.setPrice(discountedPrice);
        notifyCustomers(product, discountedPrice, discount);
    }

    @Override
    public void notifyCustomers(Product product, Price discountedPrice, double discount) {
        customers.forEach(customer -> customer.receiveMessage(
                "product " + product.getUid() + " received discounted price = " + discountedPrice.getValue() +
                "You saved " + discount + '%'));
    }

    @Override
    public void addCustomerToSaleSubscription(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeCustomerFromSaleSubscription(Customer customer) {
        customers.remove(customer);
    }
}
