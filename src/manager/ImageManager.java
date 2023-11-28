package manager;

import object.ImageStorage;

public class ImageManager {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        System.out.println(imageStorage.getImages());
    }

}
