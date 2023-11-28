package cache;

import entity.Product;

public interface CacheManager {

    void cache(Product notification);

    void removeFromCache(Product product);

    double getCached(long uid);
}
