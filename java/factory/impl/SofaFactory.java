package factory.impl;

import factory.FurnitureFactory;
import interf.Furniture;
import interf.sofa.ClassicSofa;
import interf.sofa.ModernSofa;

public class SofaFactory implements FurnitureFactory {

    @Override
    public Furniture createModernFurniture() {
        System.out.println("create modern sofa");
        return new ModernSofa();
    }

    @Override
    public Furniture createClassicFurniture() {
        System.out.println("create classic sofa");
        return new ClassicSofa();
    }
}
