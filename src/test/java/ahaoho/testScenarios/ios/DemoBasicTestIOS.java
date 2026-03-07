package ahaoho.testScenarios.ios;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ahaoho.baseTest.IosTestBase;
import io.appium.java_client.AppiumBy;

public class DemoBasicTestIOS extends IosTestBase {
        @Test
        public void IosAppiumTest() throws MalformedURLException {
                System.out.println("This is a basic demo test for ios using Appium");

                // Your test code goes here
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                wait.until(
                                ExpectedConditions.invisibilityOfElementLocated(
                                                AppiumBy.xpath("//android.view.View[contains(@content-desc, '%')]")));

                WebElement welcomeBtn = wait.until(
                                ExpectedConditions.presenceOfElementLocated(
                                                AppiumBy.accessibilityId("Welcoming 페이지로 이동")));

                welcomeBtn.click();

                WebElement getStartBtn = wait.until(
                                ExpectedConditions.presenceOfElementLocated(
                                                AppiumBy.accessibilityId("시작하기")));
                getStartBtn.click();

                WebElement loginBtn = wait.until(
                                ExpectedConditions.presenceOfElementLocated(
                                                AppiumBy.accessibilityId("로그인")));

                loginBtn.click();

                System.out.println("Appium Stopped");
        }

}
