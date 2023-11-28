package creator;

import factory.impl.ChairFactory;
import factory.impl.SofaFactory;
import factory.impl.WardrobeFactory;
import interf.Furniture;

public class ClientCreator {

    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        SofaFactory sofaFactory = new SofaFactory();
        WardrobeFactory wardrobeFactory = new WardrobeFactory();

        Furniture classicWardrobeFurniture = wardrobeFactory.createClassicFurniture();
        Furniture modernWardrobeFurniture = wardrobeFactory.createModernFurniture();
        Furniture classicChairFurniture = chairFactory.createClassicFurniture();
        Furniture modernChairFurniture = chairFactory.createModernFurniture();
        Furniture classicSofaFurniture = sofaFactory.createClassicFurniture();
        Furniture modernSofaFurniture = sofaFactory.createModernFurniture();
    }

}
