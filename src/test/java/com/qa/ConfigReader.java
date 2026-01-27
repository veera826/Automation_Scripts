package com.qa;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	
	 public static Properties prop;
	 
	 private static String configpath="src//test//resources//config//config.properties";

	    static {
	        try 
	            (FileInputStream fis = new FileInputStream(configpath)) {

	            prop = new Properties();
	            prop.load(fis);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }



public static String get(String key) {
    return prop.getProperty(key);
}
}
