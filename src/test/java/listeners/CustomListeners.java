package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    //This belongs to ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Starts Test execution......."+arg.getName());
    }

    //This belongs to ITestListener and will execute after completing Test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish Test execution......."+arg.getName());
    }

    //This belongs to ITestListener and will execute before the test methods starts i.e. @Test
    public void onTestStart(ITestResult arg0){
        System.out.println("Starts test......."+arg0.getName());
    }

    //This belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg0){
        System.out.println("Skipping test......."+arg0.getName());
    }

    //This belongs to ITestListener and will execute when a test method is passed
    public void onTestSuccess(ITestResult arg0){
        System.out.println("Passed test......."+arg0.getName());
    }

    //This belongs to ITestListener and will execute when a test is failed
    public void onTestFailure(ITestResult arg0){
        System.out.println("Failed test......."+arg0.getName());
    }

    //Not so important. Ignore for now
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){
        //TODO Auto-generated method stub
    }
}
