package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CurrencyPom;
import pages.HomePom;
import pages.LoginPom;
import pages.SearchPom;

public class currency_converter {
    WebDriver driver = null ;
    Login L = new Login();
    HomePom HP = new HomePom();
    CurrencyPom CP = new CurrencyPom();
    LoginPom LP =new LoginPom();

    public static void main(String[] args) {

    }

    @Given("User open the browser5")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^user login in the system \"(.*)\" and \"(.*)\"$")
    public void navigation(String User, String Pass) throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        LP.username(driver).sendKeys(User);
        LP.password(driver).sendKeys(Pass);
        LP.Click(driver).click();
    }

    @Given("Navigate to Home page")
    public void user5(){

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("User click on change button")
    public void user6() throws InterruptedException {

        CP.click(driver).click();
        Thread.sleep(2000);
        CP.Click2(driver).click();

    }


    @Then("successfully currency changed")
    public void Click2() throws InterruptedException {
        String Actual = driver.findElement(By.cssSelector("div>span[class=\"price actual-price\"]")).getText();
        String Expected = "€";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(4000);
        driver.quit();

    }



}
