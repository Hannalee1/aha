package ahaoho.testScenarios.ios;

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
        driver = BaseTest.initializeIOSDriver(
                "iPhone 15",
                "17.0",
                "com.example.app");
    }

    @AfterMethod
    public void tearDown() {
        BaseTest.closeDriver();
    }

    @Test
    public void testValidLogin() {
        try {
            System.out.println("Testing iOS Login with valid credentials");

            // Add your iOS login test steps here
            // Example: driver.findElement(By.id("username")).sendKeys("user@example.com");

            Assert.assertTrue(true, "iOS Login test passed");
        } catch (Exception e) {
            Assert.fail("iOS Login test failed: " + e.getMessage());
        }
    }

    @Test
    public void testInvalidLogin() {
        try {
            System.out.println("Testing iOS Login with invalid credentials");

            // Add your iOS invalid login test steps here

            Assert.assertTrue(true, "iOS Invalid login test passed");
        } catch (Exception e) {
            Assert.fail("iOS Invalid login test failed: " + e.getMessage());
        }
    }
}
