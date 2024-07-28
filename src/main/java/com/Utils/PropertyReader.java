package com.Utils;

import java.io.FileInputStream;
import java.util.*;

public class PropertyReader {
    private static Properties props;
    private static Map<String, String> map;

    static {
        try {
            map = new HashMap<String, String>();
            FileInputStream fis = new FileInputStream(FilePaths.getProperty());
            props = new Properties();
            props.load(fis);
            props.entrySet().stream().filter(e -> map.put(String.valueOf(e.getKey()), String.valueOf(e.getValue())).isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return String.valueOf(map.get(key));
    }
}
