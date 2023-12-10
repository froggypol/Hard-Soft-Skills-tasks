package observer;

import customer.Customer;
import price.Price;
import product.Product;

public interface SalePriceObserver {
    
    void provideSalePrice(Product product, double discountOnPrice);
    
    void notifyCustomers(Product product, Price discountedPrice, double discount);
    
    void addCustomerToSaleSubscription(Customer customer);
    
    void removeCustomerFromSaleSubscription(Customer customer);
    
}
