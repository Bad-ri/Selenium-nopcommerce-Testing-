package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePom;
import pages.LoginPom;
import pages.SearchPom;

public class Search {
    WebDriver driver = null ;
    Login L = new Login();
    HomePom HP = new HomePom();
    SearchPom SP = new SearchPom();
    LoginPom LP =new LoginPom();

    public static void main(String[] args) {

    }

    @Given("User open the browser4")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^User login in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("navigate to Home page")
    public void user5(){

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("^User enter a valid data for search \"(.*)\"$")
    public void user6(String search){

        SP.SearchBar(driver).sendKeys(search);
    }

    @And("User click on search button")
    public void Click(){

        SP.Button(driver).click();
    }

    @Then("successfully navigate to the product page")
    public void Click2() throws InterruptedException {
        String Actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/search?q=Apple+MacBook";
        Assert.assertTrue(Actual.contains(Expected),"Wrong input");
        Thread.sleep(4000);
        driver.quit();

    }

}
