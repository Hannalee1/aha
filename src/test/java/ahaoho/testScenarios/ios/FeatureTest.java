package ahaoho.testScenarios.ios;

import ahaoho.baseTest.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FeatureTest {

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
    public void testFeatureOne() {
        try {
            System.out.println("Testing iOS Feature One");

            // Add your iOS feature test steps here

            Assert.assertTrue(true, "iOS Feature one test passed");
        } catch (Exception e) {
            Assert.fail("iOS Feature one test failed: " + e.getMessage());
        }
    }
}
