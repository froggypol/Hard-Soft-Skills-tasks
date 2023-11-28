package factory.impl;

import cache.CacheManager;
import entity.Product;
import factory.ProductFactory;

public class ProductFactoryImpl implements ProductFactory {

    private static ProductFactoryImpl instance;

    private CacheManager cacheManager;

    private ProductFactoryImpl(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public Product createProduct(long uid, double price) {
        Product newProduct = new Product(uid, price);
        cacheManager.cache(newProduct);
        return newProduct;
    }

    public static ProductFactoryImpl getInstance(CacheManager cacheManager) {
        if (instance == null) {
            instance = new ProductFactoryImpl(cacheManager);
        }
        return instance;
    }

}
