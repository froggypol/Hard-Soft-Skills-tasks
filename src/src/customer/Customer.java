package customer;

public class Customer {
    
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void receiveMessage(String saleMsg) {
        System.out.println("Customer with name = " + getName() + " received notification :" + saleMsg);
    }

    public String getName() {
        return name;
    }
}
