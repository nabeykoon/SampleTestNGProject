package TestNGRunner;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestNGRunner {

    public static void main(String[] args) {

        //create an object of TestNG
        TestNG objTNG = new TestNG();

        //Define a list
        List<String> suites = new ArrayList<String>();

        //Add the testng xml files
        suites.add("C:\\Users\\nabey\\OneDrive\\Repos\\SampleTestngProject\\grouping.xml");
        suites.add("C:\\Users\\nabey\\OneDrive\\Repos\\SampleTestngProject\\annotation.xml");

        // Set the suites to run
        objTNG.setTestSuites(suites);

        //Call the run method
        objTNG.run();
    }

}
