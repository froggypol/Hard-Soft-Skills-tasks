package main;

import customer.Customer;
import observer.SalePriceObserver;
import observer.impl.SalePriceObserverImpl;
import price.Price;
import product.Product;

public class MailSender {

    public static void main(String[] args) {
        SalePriceObserver salePriceObserver = new SalePriceObserverImpl();
        Customer customer1 = new Customer("Nick");
        Customer customer2 = new Customer("Miley");
        Customer customer3 = new Customer("Olan");
        Customer customer4 = new Customer("Freeda");

        salePriceObserver.addCustomerToSaleSubscription(customer1);
        salePriceObserver.addCustomerToSaleSubscription(customer2);
        salePriceObserver.addCustomerToSaleSubscription(customer3);
        salePriceObserver.addCustomerToSaleSubscription(customer4);

        Product p1 = new Product("Ipone 17", new Price(1200.0));
        Product p2 = new Product("Samsung SuperGalaxy", new Price(3033.0));

        salePriceObserver.provideSalePrice(p1, 50);
        salePriceObserver.provideSalePrice(p2, 33);
    }

}
