package cache.impl;

import cache.CacheManager;
import entity.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CacheManagerImpl implements CacheManager {

    private static CacheManagerImpl instance;

    private Map<Long, Double> id2ProductPriceStorage;

    private CacheManagerImpl() {
        id2ProductPriceStorage = new HashMap<>();
    }

    @Override
    public void cache(Product product) {
        System.out.println("saving into cache product price = " + product.getPrice() +
                ", product id = " + product.getUid());
        id2ProductPriceStorage.putIfAbsent(product.getUid(), product.getPrice());
    }

    @Override
    public void removeFromCache(Product product) {
        System.out.println("removing from cache price = " + product.getPrice() +
                ", product id = " + product.getUid());
        id2ProductPriceStorage.entrySet().
                removeIf(cachedNotificationEntry -> cachedNotificationEntry.getKey().equals(product.getUid()));
    }

    @Override
    public double getCached(long uid) {
        if (id2ProductPriceStorage.containsKey(uid)) {
            return id2ProductPriceStorage.get(uid);
        } else {
            throw new NoSuchElementException();
        }
    }

    public static CacheManagerImpl getInstance() {
        if (instance == null) {
            instance = new CacheManagerImpl();
        }
        return instance;
    }
}
