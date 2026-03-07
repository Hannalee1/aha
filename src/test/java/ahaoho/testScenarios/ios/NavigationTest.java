package ahaoho.testScenarios.ios;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ahaoho.baseTest.BaseTest;

import org.testng.Assert;

public class NavigationTest {

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
    public void testNavigateToHome() {
        try {
            System.out.println("Testing iOS Navigation to Home");

            // Add your iOS navigation test steps here

            Assert.assertTrue(true, "iOS Navigation to home passed");
        } catch (Exception e) {
            Assert.fail("iOS Navigation test failed: " + e.getMessage());
        }
    }

    @Test
    public void testNavigateToSettings() {
        try {
            System.out.println("Testing iOS Navigation to Settings");

            // Add your iOS navigation test steps here

            Assert.assertTrue(true, "iOS Navigation to settings passed");
        } catch (Exception e) {
            Assert.fail("iOS Navigation test failed: " + e.getMessage());
        }
    }
}
