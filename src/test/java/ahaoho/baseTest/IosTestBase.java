package ahaoho.baseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IosTestBase {
    public IOSDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        System.out.println("Start Appium");
        File appiumJS = new File("/Users/admin/.nvm/versions/node/v22.18.0/lib/node_modules/appium/index.js");

        service = new AppiumServiceBuilder()
                .withAppiumJS(appiumJS)
                .withIPAddress("127.0.0.1")
                .usingPort(4723).build();
        service.start();
        System.out.println("Appium Started");

        // Creating object for IOSDriver
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName("iOS");
        options.setAutomationName("XCUITest");
        options.setDeviceName("iPhone 16");
        options.setPlatformVersion("18.3.1");

        options.setApp(
                Paths.get(
                        "/Users/admin/Documents/AutomationProjects/AutoMobile/MobileAutomation/Apps/Runner.app")
                        .toAbsolutePath().toString());
        options.setCapability("deviceReadyTimeout", 60000);
        options.setCapability("wdaLaunchTimeout", 60000);
        options.setCapability("wdaConnectionTimeout", 60000);

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterClass
    public void tearDown() {
        System.out.println("Base Test Teardown");
        driver.quit();
        service.stop();
    }

}
