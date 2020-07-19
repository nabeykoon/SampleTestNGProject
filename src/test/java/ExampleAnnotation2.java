import org.testng.annotations.*;

public class ExampleAnnotation2 {

    @BeforeSuite
    void beforeTestsuite(){
        System.out.println("This will execute before test suite");
    }

    @AfterSuite
    void afterTestsuite(){
        System.out.println("This will execute after test suite");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before test ExampleAnnotation2");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after test ExampleAnnotation2");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("This will be executed before the class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will be executed after the class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every test method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute after every test method");
    }

    @Test
    void test3() {
        System.out.println("This is a test3");
    }

    @Test
    void test4() {
        System.out.println("This is a test4");
    }


}
