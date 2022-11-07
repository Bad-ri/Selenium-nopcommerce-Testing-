package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.*;

public class Color {
    WebDriver driver = null ;
    Login L = new Login();
    HomePom HP = new HomePom();
    CurrencyPom CP = new CurrencyPom();
    LoginPom LP =new LoginPom();
    ColorPom COP = new ColorPom();

    public static void main(String[] args) {

    }

    @Given("User open the browser7")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^USer login in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("navigate to Apparel page")
    public void user5(){

        COP.ApparelCategory(driver).click();

    }

    @When("User click on shoes category")
    public void user7() throws InterruptedException {
        Thread.sleep(2000);
        COP.ShoesCategory(driver).click();


    }

    @And("User choose red color for filter")
    public void user4() throws InterruptedException {

        Thread.sleep(2000);
        COP.Color(driver).click();

    }

    @Then("successfully page filterd")
    public void Click2() throws InterruptedException {
        String Actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);
        driver.quit();

    }
}
