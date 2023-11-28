package factory.impl;

import factory.FurnitureFactory;
import interf.Furniture;
import interf.wardrobe.ClassicWardrobe;
import interf.wardrobe.ModernWardrobe;

public class WardrobeFactory implements FurnitureFactory {

    @Override
    public Furniture createModernFurniture() {
        System.out.println("create modern wardrobe");
        return new ModernWardrobe();
    }

    @Override
    public Furniture createClassicFurniture() {
        System.out.println("create classic wardrobe");
        return new ClassicWardrobe();
    }
}
