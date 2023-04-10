package File_Defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.CurrencyPom;
import pages.LoginPom;

import static File_Defination.Hooks.driver;

public class currency_converter {

    CurrencyPom CP = new CurrencyPom();
    LoginPom LP =new LoginPom();

    public static void main(String[] args) {

    }

    @And("^user login in the system \"(.*)\" and \"(.*)\"$")
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

    }



}
