package File_Defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoryPom;
import pages.CurrencyPom;
import pages.LoginPom;

import static File_Defination.Hooks.driver;


public class Categories {

    CurrencyPom CP = new CurrencyPom();
    LoginPom LP =new LoginPom();
    CategoryPom CYP =new CategoryPom();

    public static void main(String[] args) {

    }

    @And("^uSer login in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("NAvigate to Home page")
    public void user5(){

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("User click on a category")
    public void user7() throws InterruptedException {
        Thread.sleep(2000);
        CYP.Category(driver).click();


    }

    @And("User click on a subcategory")
    public void user4() throws InterruptedException {

        Thread.sleep(2000);
        CYP.SubCategory(driver).click();

    }


    @Then("successfully page oppened")
    public void Click2() throws InterruptedException {
        String Actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/desktops";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);

    }

}