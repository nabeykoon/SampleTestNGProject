import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("This is a Test1...");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("This is a Test2...");
    }

    @Test(groups = {"Regression"})
    void test3(){
        System.out.println("This is a Test3...");
    }

    @Test(groups = {"Regression"})
    void test4(){
        System.out.println("This is a Test4...");
    }

    @Test(groups = {"sanity", "Regression"})
    void test5(){
        System.out.println("This is a Test5...");
    }
}
