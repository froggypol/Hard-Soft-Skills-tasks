package inventory;

import cache.CacheManager;
import cache.impl.CacheManagerImpl;
import entity.Product;
import factory.ProductFactory;
import factory.impl.ProductFactoryImpl;

public class InventoryManager {

    public static void main(String[] args) {

        CacheManager cacheManager = CacheManagerImpl.getInstance();

        ProductFactory factory = ProductFactoryImpl.getInstance(cacheManager);

        Product p1 = factory.createProduct(1, 12);
        Product p2 = factory.createProduct(2, 14);
        Product p3 = factory.createProduct(3, 1);

        System.out.println("Price = " + cacheManager.getCached(p2.getUid()) + " for product with id = " + p2.getUid());

        cacheManager.removeFromCache(p1);

    }

}
