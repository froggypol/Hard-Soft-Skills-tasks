package client;

import adapter.DataAdapter;
import adapter.impl.DataAdapterImpl;
import formats.JsonData;
import formats.XmlData;

public class Main {

    public static void main(String[] args) {
        XmlData sourceData = new XmlData("xmlData string");
        DataAdapter dataAdapter = new DataAdapterImpl();
        JsonData targetData = dataAdapter.adapt(sourceData);
        System.out.println(targetData.getData());
    }

}
