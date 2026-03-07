package ahaoho.testScenarios.android;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ahaoho.baseTest.BaseTest;

import org.testng.Assert;

public class FeatureTest {

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
    public void testFeatureOne() {
        try {
            System.out.println("Testing Android Feature One");

            // Add your feature test steps here

            Assert.assertTrue(true, "Feature one test passed");
        } catch (Exception e) {
            Assert.fail("Feature one test failed: " + e.getMessage());
        }
    }
}
