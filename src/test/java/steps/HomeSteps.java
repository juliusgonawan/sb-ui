package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeSteps {

    WebDriver driver = new ChromeDriver();

    public By investingMenu = By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > a:nth-child(1)");
    public By proToolsMenu = By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > a:nth-child(2)");
    public By academyMenu = By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > a:nth-child(3)");
    public By aboutUsMenu = By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > a:nth-child(4)");
    public By blogMenu = By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > a:nth-child(5)");
    public By helpMenu = By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > a:nth-child(6)");
    public By signUpMenu = By.className("register-lnd");
    public By loginMenu = By.className("login-ldn");

    @Given("Open stockbit homepage")
    public void open_stockbit_homepage() {
        driver.get("https://stockbit.com/");
    }

    @Then("I can verify all menu bar showed")
    public void iCanVerifyAllMenuBarShowed()
    {
        Assert.assertEquals(true, driver.findElement(investingMenu).isDisplayed());
        Assert.assertEquals(true, driver.findElement(proToolsMenu).isDisplayed());
        Assert.assertEquals(true, driver.findElement(academyMenu).isDisplayed());
        Assert.assertEquals(true, driver.findElement(aboutUsMenu).isDisplayed());
        Assert.assertEquals(true, driver.findElement(blogMenu).isDisplayed());
        Assert.assertEquals(true, driver.findElement(helpMenu).isDisplayed());
        driver.close();
    }

    @Then("I can verify menu title value correctly")
    public void iCanVerifyMenuTitleValueCorrectly() {
        Assert.assertEquals("Investing", driver.findElement(investingMenu).getText());
        Assert.assertEquals("Pro Tools", driver.findElement(proToolsMenu).getText());
        Assert.assertEquals("Academy", driver.findElement(academyMenu).getText());
        Assert.assertEquals("About Us", driver.findElement(aboutUsMenu).getText());
        Assert.assertEquals("Blog", driver.findElement(blogMenu).getText());
        Assert.assertEquals("Help", driver.findElement(helpMenu).getText());
        driver.close();
    }

    @And("Go to sign up page")
    public void goToSignUpPage() {
        driver.findElement(signUpMenu).click();
    }


    @Then("Verify going to {string} url")
    public void verifyGoingToUrl(String url) {
        Assert.assertEquals(driver.getCurrentUrl(),url);
        driver.close();
    }

    @And("Go to login page")
    public void goToLoginPage() {
        driver.findElement(loginMenu).click();
    }

  
}
