package Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class demo {

   static Properties properties;

    public static void main(String[] args) throws IOException {

        //create object for property file
         properties = new Properties();

        //Specify the path of file
        FileInputStream fis = new FileInputStream("C:\\Personal\\Java practice\\PracticeJava\\Practice\\src\\Property\\config.properties");

       // file load ---> property
        properties.load(fis);

        System.out.println(disp("name"));

    }
    public static String disp(String key){
    // properties.getProperty(key)
     return properties.getProperty(key);

    }
}
