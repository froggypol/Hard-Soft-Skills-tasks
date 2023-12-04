package service;

import adapter.impl.DeprecatedLibraryAdapterImpl;
import library.DeprecatedLibrary;
import library.UpgradedLibrary;
import library.impl.DeprecatedLibraryImpl;

public class ClientService {

    public static void main(String[] args) {
        DeprecatedLibrary deprecatedLib = new DeprecatedLibraryImpl();

        UpgradedLibrary libraryAdapter = new DeprecatedLibraryAdapterImpl(deprecatedLib);
        libraryAdapter.useUpgradedFunctions();
    }

}
