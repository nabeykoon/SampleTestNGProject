import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){

        Object[][] data = {{"abc@gmail.com", "abc"}, {"efg@gmail.com", "efg"}, {"xyz@gmail.com", "xyz"}};
        return data;
    }
}
