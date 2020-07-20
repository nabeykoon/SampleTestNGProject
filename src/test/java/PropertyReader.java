import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
        //To access .properties
        Properties prop = new Properties();
        //To read fileIn
        FileInputStream fileIn = new FileInputStream("src/test/data.properties");
        prop.load(fileIn);
        System.out.println(prop.getProperty("browser"));
        prop.setProperty("browser", "firefox");
        System.out.println(prop.getProperty("browser"));

        //To write fileIn
        FileOutputStream fileOut = new FileOutputStream("src/test/data.properties");
        prop.store(fileOut, null);

    }
}
