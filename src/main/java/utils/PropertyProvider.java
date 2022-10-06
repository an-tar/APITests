package utils;

import java.util.ResourceBundle;

public class PropertyProvider {

    public static String getConfigData(String key) {
        return ResourceBundle.getBundle("config").getString(key);
    }

}
