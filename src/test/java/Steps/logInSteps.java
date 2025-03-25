package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class logInSteps extends Base_InheritancePage {

    WebDriver driver;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws InterruptedException {
    }

    @And("I enter the username (.*)$")
    public void iEnterTheUsernameUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter the password (.*)$")
    public void iEnterThePasswordPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton(String login_button) {
        loginPage.clickLoginIn(login_button);

        ///driver.findElement(By.id("login-button")).click();
    }

    /// Add product to cart

    @Then("I should be taken to the products page")
    public void iShouldBeTakenToTheProductsPage() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
    }

}


