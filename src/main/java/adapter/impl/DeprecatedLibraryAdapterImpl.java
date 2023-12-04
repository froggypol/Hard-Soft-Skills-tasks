package adapter.impl;

import library.DeprecatedLibrary;
import library.UpgradedLibrary;

public class DeprecatedLibraryAdapterImpl implements UpgradedLibrary {
    
    private DeprecatedLibrary deprecatedLibrary;

    public DeprecatedLibraryAdapterImpl(DeprecatedLibrary deprecatedLibrary) {
        this.deprecatedLibrary = deprecatedLibrary;
    }

    @Override
    public void useUpgradedFunctions() {
        System.out.println("adapting deprecated lib to use upgraded lib interface");
        deprecatedLibrary.useRegularFunctions();
    }
}
