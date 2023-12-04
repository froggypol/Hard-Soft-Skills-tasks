package library.impl;

import library.UpgradedLibrary;

public class UpgradedLibraryImpl implements UpgradedLibrary {

    @Override
    public void useUpgradedFunctions() {
        System.out.println("new lib uses upgraded functionality");
    }
}
