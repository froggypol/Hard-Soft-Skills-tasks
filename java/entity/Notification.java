package entity;

import java.util.UUID;

public abstract class Notification {

    private long uid;
    private String description;

    public Notification(String description) {
        this.uid = UUID.randomUUID().getMostSignificantBits();
        this.description = description;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
