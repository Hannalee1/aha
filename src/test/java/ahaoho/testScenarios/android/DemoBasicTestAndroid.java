package ahaoho.testScenarios.android;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import ahaoho.baseTest.AndroidTestBase;
import pageObjectModel.android.GetStartsPage;
import pageObjectModel.android.SlashPage;
import pageObjectModel.android.WelcomePage;

//https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md

public class DemoBasicTestAndroid extends AndroidTestBase {
        @Test
        public void AndroidAppiumTest() throws MalformedURLException {

                SlashPage slashPage = new SlashPage(driver);
                System.out.println("This is a basic demo test for Android using Appium");
                slashPage.waitForLoadingToDisappear(); // Wait for loading to disappear
                WelcomePage welcomePage = new WelcomePage(driver);
                welcomePage.clickWelcomeBtn();
                welcomePage.clickGetStartBtn();
                GetStartsPage getStartsPage = new GetStartsPage(driver);
                getStartsPage.clickLoginBtn();
                System.out.println("Appium Stopped");
        }

}
