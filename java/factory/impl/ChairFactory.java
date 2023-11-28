package factory.impl;

import factory.FurnitureFactory;
import interf.Furniture;
import interf.chair.ClassicChair;
import interf.chair.ModernChair;

public class ChairFactory implements FurnitureFactory {

    @Override
    public Furniture createModernFurniture() {
        System.out.println("create modern chair");
        return new ModernChair();
    }

    @Override
    public Furniture createClassicFurniture() {
        System.out.println("create classic chair");
        return new ClassicChair();
    }
}
