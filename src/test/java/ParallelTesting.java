import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelTesting {

    private static WebDriver driver;

    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @Test
    void homePageTitleTest() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM","Title is not matched");
    }

    @AfterClass
    void quit(){
        driver.quit();
    }
}
