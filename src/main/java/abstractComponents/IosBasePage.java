package abstractComponents;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;

public class IosBasePage extends BasePage {

    public IosBasePage(IOSDriver driver) {
        super(driver);
    }

    // ===== IOS SWIPE UP =====
    public void swipeUp() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", params);
    }

    // ===== IOS LONG PRESS =====
    public void longPress(WebElement element) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("elementId", ((RemoteWebElement) element).getId());
        params.put("duration", 2000);
        ((JavascriptExecutor) driver).executeScript("mobile: touchAndHold", params);
    }
}