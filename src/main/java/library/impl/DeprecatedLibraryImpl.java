package library.impl;

import library.DeprecatedLibrary;

public class DeprecatedLibraryImpl implements DeprecatedLibrary {

    @Override
    public void useRegularFunctions() {
        System.out.println("old lib uses regular functionality");
    }

    @Override
    public void useDeprecatedFunctions() {
        System.out.println("old lib uses deprecated functionality");
    }
}
