package object;

import java.util.List;

public class ImageStorage {

    private List<HeavyImageObject> imageStorage;

    public List<HeavyImageObject> getImages() {
        if (imageStorage == null) {
            System.out.println("initializing storage");
            imageStorage = List.of(new HeavyImageObject("src1", 1),
                    new HeavyImageObject("src2", 2),
                    new HeavyImageObject("src3", 3));
        }

        return imageStorage;
    }

    public List<HeavyImageObject> getImageStorage() {
        return imageStorage;
    }
}
