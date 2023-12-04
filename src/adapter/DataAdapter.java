package adapter;

import formats.JsonData;
import formats.XmlData;

public interface DataAdapter {

    JsonData adapt(XmlData xmlData);

}
