/*
1. Setup - Open browser and application
2. Login
3. Clone
 */

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login method");
    }

    @Test(priority = 3, enabled = false)
    void tearDown() {
        System.out.println("Closing browser");
    }
}
