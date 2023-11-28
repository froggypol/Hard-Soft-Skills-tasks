package factory;

import interf.Furniture;

public interface FurnitureFactory {

    Furniture createModernFurniture();

    Furniture createClassicFurniture();

}
