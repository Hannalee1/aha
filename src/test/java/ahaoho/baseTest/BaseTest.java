package ahaoho.baseTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class BaseTest {

    private static AppiumDriver driver;
    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    /**
     * Initialize Android Driver
     */
    public static AppiumDriver initializeAndroidDriver(String deviceName, String platformVersion,
            String appPackage, String appActivity)
            throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", false);

        driver = new AndroidDriver(new URL(APPIUM_SERVER_URL), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    /**
     * Initialize iOS Driver
     */
    public static AppiumDriver initializeIOSDriver(String deviceName, String platformVersion,
            String bundleId)
            throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("bundleId", bundleId);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", false);

        driver = new IOSDriver(new URL(APPIUM_SERVER_URL), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    /**
     * Get current driver instance
     */
    public static AppiumDriver getDriver() {
        return driver;
    }

    /**
     * Close driver
     */
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
