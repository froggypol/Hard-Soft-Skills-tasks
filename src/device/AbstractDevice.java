package device;

public abstract class AbstractDevice {

    private String id;

    public AbstractDevice(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void pay();
    public abstract void createDevice();

}
