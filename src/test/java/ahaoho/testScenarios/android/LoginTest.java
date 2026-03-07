package ahaoho.testScenarios.android;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ahaoho.baseTest.BaseTest;

import org.testng.Assert;

public class LoginTest {

    private AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = BaseTest.initializeAndroidDriver(
                "Android Emulator",
                "13",
                "com.example.app",
                "com.example.app.MainActivity");
    }

    @AfterMethod
    public void tearDown() {
        BaseTest.closeDriver();
    }

    @Test
    public void testValidLogin() {
        try {
            // Example: Navigate to login screen
            System.out.println("Testing Android Login with valid credentials");

            // Add your login test steps here
            // Example: driver.findElement(By.id("username")).sendKeys("user@example.com");

            Assert.assertTrue(true, "Login test passed");
        } catch (Exception e) {
            Assert.fail("Login test failed: " + e.getMessage());
        }
    }

    @Test
    public void testInvalidLogin() {
        try {
            System.out.println("Testing Android Login with invalid credentials");

            // Add your invalid login test steps here

            Assert.assertTrue(true, "Invalid login test passed");
        } catch (Exception e) {
            Assert.fail("Invalid login test failed: " + e.getMessage());
        }
    }
}
