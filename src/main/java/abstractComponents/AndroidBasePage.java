package abstractComponents;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;

public class AndroidBasePage extends BasePage {

    public AndroidBasePage(AndroidDriver driver) {
        super(driver);
    }

    // ===== ANDROID LONG PRESS =====
    public void longPress(WebElement element) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("elementId", ((RemoteWebElement) element).getId());
        params.put("duration", 2000);
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", params);
    }

    // ===== ANDROID SCROLL DOWN =====
    public void scrollDown() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("direction", "down");
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", params);
    }

    // ===== ANDROID BACK BUTTON =====
    public void pressBack() {
        ((AndroidDriver) driver).navigate().back();
    }
}