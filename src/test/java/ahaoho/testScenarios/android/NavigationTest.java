package ahaoho.testScenarios.android;

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
    public void testNavigateToHome() {
        try {
            System.out.println("Testing Android Navigation to Home");

            // Add your navigation test steps here

            Assert.assertTrue(true, "Navigation to home passed");
        } catch (Exception e) {
            Assert.fail("Navigation test failed: " + e.getMessage());
        }
    }

    @Test
    public void testNavigateToSettings() {
        try {
            System.out.println("Testing Android Navigation to Settings");

            // Add your navigation test steps here

            Assert.assertTrue(true, "Navigation to settings passed");
        } catch (Exception e) {
            Assert.fail("Navigation test failed: " + e.getMessage());
        }
    }
}
