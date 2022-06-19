package collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class TestProperties {


    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.setProperty("Color","Red");
        properties.setProperty("Font","Times new Roman");
        properties.setProperty("Property3","Value3");

        FileWriter fileWriter= new FileWriter("props.properties");
        properties.store(fileWriter,"These are properties");
        fileWriter.close();

        FileReader fileReader= new FileReader("props.properties");
        properties.load(fileReader);
        System.out.println(properties.getProperty("Color"));


    }
}
