package ahaoho.baseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidTestBase {
    public AndroidDriver driver;
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

        // Creating object for AndroidDriver
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Medium Phone API 36.1");
        // options.setAppPackage("com.example.app");
        // options.setAppActivity("com.example.app.MainActivity");
        options.setApp(
                Paths.get("Apps", "app-release.apk").toAbsolutePath().toString());
        options.setCapability("uiautomator2ServerInstallTimeout", 60000);
        options.setCapability("uiautomator2ServerLaunchTimeout", 60000);
        options.setCapability("adbExecTimeout", 60000);
        // options.setApp("/Users/admin/Documents/AutoMobile/MobileAutomation/Apps/app-release.apk");
        // options.setPlatformName("Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterClass
    public void tearDown() {
        System.out.println("Base Test Teardown");
        driver.quit();
        service.stop();
    }

}
