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
import pages.Wish_ListPom;

public class Wish_List {
    public static void main(String[] args) {

    }
    WebDriver driver = null ;
    HomePom HP = new HomePom();
    LoginPom LP =new LoginPom();
    Wish_ListPom WL = new Wish_ListPom();

    @Given("User open the browser10")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^USER Login in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("Navigate to shoes page and choose one")
    public void user5(){
        driver.navigate().to("https://demo.nopcommerce.com/adidas-consortium-campus-80s-running-shoes");
       // WL.open_shoe_page(driver).click();

    }

    @When("User opens dropdown list and choose the size")
    public void user8() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
        WL.open_drop_list(driver).click();
        WL.choose_size(driver).click();

    }

    @And("Click on add to wishlist button")
    public void user9() throws InterruptedException {
        Thread.sleep(2000);
        WL.WishButton(driver).click();

    }

    @And("successfully added to wishlist")
    public void user10() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = WL.notify2(driver).getText();
        String Expected = "The product has been added to your";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);

    }

    @When("User navigate to Home and choose a phone to add to wishlist")
    public void user15() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");


    }

    @And("Click on add to wishlist")
    public void user16() throws InterruptedException {
        Thread.sleep(2000);
        WL.WishButton2(driver).click();

    }

    @Then("successfully added to wishlist NOTIFICATION")
    public void Click3() throws InterruptedException {
//        String Actual = WL.notify2(driver).getText();
//        String Expected = "The product has been added to your";
//        Assert.assertFalse(Actual.contains(Expected),"Wrong data");
//        Thread.sleep(2000);
        driver.quit();

    }


}
