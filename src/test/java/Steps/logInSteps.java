package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class logInSteps {

    WebDriver driver;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
    }

    @And("I enter the username (.*)$")
    public void iEnterTheUsernameUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I enter the password (.*)$")
    public void iEnterThePasswordPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    /// Add product to cart


    @Then("I should be taken to the products page")
    public void iShouldBeTakenToTheProductsPage() {
        driver.findElement(By.xpath("Products").isDisplayed());
    }

}


