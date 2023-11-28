package factory;

import entity.Product;

public interface ProductFactory {

    Product createProduct(long uid, double price);

}
