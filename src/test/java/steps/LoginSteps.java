package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;


public class LoginSteps {
    WebDriver driver = new ChromeDriver();

    public By userTextBox = By.id("username");
    public By passwordTextBox = By.id("password");
    public By loginButton = By.id("loginbutton");
    public By eyeButton = By.cssSelector("#form-login > div.loginshadow > img.eye-icon");
    public By forgetPassword = By.cssSelector("#form-login > div.loginshadow > div.forgot-password > p > a");


    @Given("Open stockbit login url")
    public void openStockbitLoginUrl() {
        driver.get("https://stockbit.com/#/login");
    }
    
    @And("Input username {string} and password {string}")
    public void inputUsernameAndPassword(String user, String pass) {
        driver.findElement(userTextBox).sendKeys(user);
        driver.findElement(passwordTextBox).sendKeys(pass);
    }

    @And("Click login")
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }



    @Then("User still on page login")
    public void userStillOnPageLogin() {
        Assert.assertEquals(true,driver.findElement(loginButton).isDisplayed());
    }

    @And("Click eye button")
    public void clickEyeButton() {
        driver.findElement(eyeButton).click();
    }

    @Then("Show password unmasking {string}")
    public void showPasswordUnmasking(String pass) {
        String password = driver.findElement(passwordTextBox).getText();
        System.out.println(password);
        Assert.assertEquals(pass,password);
    }

    @And("Click forget password")
    public void clickForgetPassword() {
        driver.findElement(forgetPassword).click();
    }

    @Then("Go to forget password url {string}")
    public void showForgetPasswordPage(String url) {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }
}
