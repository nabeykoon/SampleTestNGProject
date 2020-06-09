import org.testng.annotations.*;

public class ExampleAnnotation1 {

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after test");
    }

@BeforeClass
    void beforeClass(){
        System.out.println("This will be executed before the class");
    }
@AfterClass
    void afterClass(){
        System.out.println("This will be executed after the class");
    }

@BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every test method");
    }

    @Test
    void test1() {
        System.out.println("This is a test1");
    }

    @Test
    void test2() {
        System.out.println("This is a test2");
    }
}
