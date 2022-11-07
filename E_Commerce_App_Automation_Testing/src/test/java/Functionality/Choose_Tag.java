package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.*;

public class Choose_Tag {
    WebDriver driver = null ;
    HomePom HP = new HomePom();
    LoginPom LP =new LoginPom();
    TagsPom TP = new TagsPom();

    public static void main(String[] args) {

    }

    @Given("User open the browser8")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^USER login in the system \"(.*)\" and \"(.*)\"$")
    public void navigation(String User, String Pass) throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        LP.username(driver).sendKeys(User);
        LP.password(driver).sendKeys(Pass);
        LP.Click(driver).click();
        String Actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/login?returnurl=%2F";
        Assert.assertFalse(Actual.contains(Expected),"Logged in");
        Thread.sleep(2000);
    }

    @Given("navigate to Category page")
    public void user5(){
        driver.navigate().to("https://demo.nopcommerce.com/electronics");

    }

    @When("User click on a Tag")
    public void user7() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        TP.Choose_tag(driver).click();

    }

    @Then("successfully page loaded")
    public void Click2() throws InterruptedException {
        String Actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/awesome";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);
        driver.quit();

    }
}