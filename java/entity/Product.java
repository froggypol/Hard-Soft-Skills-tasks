package entity;

public class Product {

    private long uid;
    private double price;

    public Product(long uid, double price) {
        this.uid = uid;
        this.price = price;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
