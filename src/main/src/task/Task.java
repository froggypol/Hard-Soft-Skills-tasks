package task;

public class Task {

    private String id;
    private double cost;

    public Task(String id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

}
