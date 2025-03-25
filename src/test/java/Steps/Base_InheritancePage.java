package Steps;

import Pages.LoginPage;
import Utils.browserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_InheritancePage {
    /// this is used to call methods

    browserFactory browserFactory = new browserFactory();

    final WebDriver driver= browserFactory.startBrowser("edge", "https://www.saucedemo.com/");
/// calling the loginPage
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    ///logInSteps logInSteps = PageFactory.initElements(driver, logInSteps.class);
}
