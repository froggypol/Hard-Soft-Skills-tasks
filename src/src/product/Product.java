package product;

import price.Price;

public class Product {
    
    private String uid;
    private Price price;

    public Product(String uid, Price price) {
        this.uid = uid;
        this.price = price;
    }

    public String getUid() {
        return uid;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
