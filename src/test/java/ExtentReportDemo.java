import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExtentReportDemo {
    ExtentReports extent;

    private static WebDriver driver;

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @BeforeClass
    public void config(){

        //ExtentReports, ExtentSparkReporter
        String pathToReport = System.getProperty("user.dir")+"\\Extent Reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(pathToReport);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Nadeera");
    }

    @Test
    void logoTest() {
        extent.createTest("logoTest");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @Test
    void homePageTitleTest() {

        ExtentTest test1 = extent.createTest("homePageTitleTest");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM", "Title is not matched");

    }

    @AfterClass
    void quit() {
        driver.quit();
        extent.flush();
    }
}
