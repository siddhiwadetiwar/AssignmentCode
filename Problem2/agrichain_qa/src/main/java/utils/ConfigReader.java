package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;

    public static Properties initConfig() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
