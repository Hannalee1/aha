package pageObjectModel.android;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstractComponents.AndroidBasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage extends AndroidBasePage {

    public WelcomePage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(accessibility = "Welcoming 페이지로 이동")
    private WebElement welcomeBtn;

    @AndroidFindBy(accessibility = "시작하기")
    private WebElement getStartBtn;

    public void clickWelcomeBtn() {
        waitForClickable(welcomeBtn);
        welcomeBtn.click(); // click on welcome button
    }

    public void clickGetStartBtn() {
        waitForClickable(getStartBtn);
        getStartBtn.click(); // click on get start button
    }

}
