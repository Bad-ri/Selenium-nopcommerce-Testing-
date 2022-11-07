package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Add_Pom;
import pages.HomePom;
import pages.LoginPom;

public class Add_Product_To_Cart {
    public static void main(String[] args) {

    }
    WebDriver driver = null ;
    HomePom HP = new HomePom();
    LoginPom LP =new LoginPom();

    Add_Pom ATC = new Add_Pom();

    @Given("User open the browser9")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^USEr login in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("navigate to shoes page and shoes one")
    public void user5(){
        driver.navigate().to("https://demo.nopcommerce.com/shoes");
        ATC.open_shoe_page(driver).click();

    }

    @When("User open dropdown list and choose the size")
    public void user8() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
        ATC.open_drop_list(driver).click();
        ATC.choose_size(driver).click();

    }

    @And("Click on add to cart button")
    public void user9() throws InterruptedException {
        Thread.sleep(2000);
        ATC.add_to_cart(driver).click();

    }

    @And("successfully added")
    public void user10() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = ATC.notify(driver).getText();
        String Expected = "The product has been added to your shopping cart";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);

    }

    @When("User navigate to home and choose a phone to add to cart")
    public void user11() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        ATC.open_phone_page(driver).click();

    }

    @And("Click on add to Cart button")
    public void user12() throws InterruptedException {
        Thread.sleep(2000);
        ATC.add(driver).click();

    }

    @Then("successfully added notification")
    public void Click3() throws InterruptedException {
        String Actual = ATC.notify_cheak(driver).getText();
        String Expected = "The product has been added to your";
        Assert.assertFalse(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);
        driver.quit();

    }


}

