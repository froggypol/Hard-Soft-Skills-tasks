package adapter.impl;

import adapter.DataAdapter;
import formats.JsonData;
import formats.XmlData;

public class DataAdapterImpl implements DataAdapter {

    @Override
    public JsonData adapt(XmlData xmlData) {
        System.out.println("Adapting " + xmlData);
        return new JsonData(xmlData.getData());
    }
}
