package pool;

import android.widget.ArrayAdapter;
import java.util.HashMap;
import java.util.Map;

public class AdapterPool  {

    private static Map<String, ArrayAdapter<String>> adapters = new HashMap<>();

    public static void addAdapter(ArrayAdapter<String> adapter, String name) {
       adapters.put(name, adapter);
    }

    public static ArrayAdapter<String> getAdapter (String name) {
        return  adapters.get(name);
    }

    public static Map<String, ArrayAdapter<String>> getAdaptersList() {
        return adapters;
    }
}
