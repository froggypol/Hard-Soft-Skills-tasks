package object;

public class HeavyImageObject {
    private String src;
    private long id;

    public HeavyImageObject(String src, long id) {
        this.src = src;
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
