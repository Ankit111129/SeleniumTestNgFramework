package com.thequalityacademy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

public  static String readKey(String key)
{

    Properties p;

    String user_dir = System.getProperty("user.dir");
    //C:\Users\APandey15\JavaAutomation\SeleniumTestNgFramework

    String file_path =  user_dir+ "/src/resources/data.properties";
     // full path
    // C:\Users\APandey15\JavaAutomation\SeleniumTestNgFramework\src\resources\data.properties

    try {
        FileInputStream fileInputStream = new FileInputStream(file_path);

        p = new Properties();
        p.load(fileInputStream);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}

}
