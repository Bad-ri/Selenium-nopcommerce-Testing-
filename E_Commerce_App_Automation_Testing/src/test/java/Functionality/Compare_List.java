package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.*;

public class Compare_List {
    public static void main(String[] args) {

    }
    WebDriver driver = null ;
    HomePom HP = new HomePom();
    LoginPom LP =new LoginPom();
    Add_Pom ATC = new Add_Pom();
    ComparePom CPP = new ComparePom();

    @Given("User open the browser11")
    public void user_open_the_browser(){

        driver =  HP.open_browser(driver);
    }

    @And("^USER LOgin in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("Navigate to shoes page and user choose a one")
    public void user5(){
        driver.navigate().to("https://demo.nopcommerce.com/adidas-consortium-campus-80s-running-shoes");
       // CPP.open_shoe_page(driver).click();

    }

    @When("User opens the dropdown list and choose the size")
    public void user8() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
        ATC.open_drop_list(driver).click();
        ATC.choose_size(driver).click();

    }

    @And("Click on add to compare list")
    public void user9() throws InterruptedException {
        Thread.sleep(2000);
        CPP.CompareButton(driver).click();

    }

    @And("successfully added to compare list")
    public void user10() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = CPP.notify(driver).getText();
        String Expected = "The product has been added to your";
        Assert.assertTrue(Actual.contains(Expected),"Wrong data");
        Thread.sleep(2000);

    }

    @When("User navigate to Home and Choose a phone to add to compare list")
    public void user15() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");


    }

    @And("Click on compare list")
    public void user16() throws InterruptedException {
        Thread.sleep(2000);
        CPP.CompareButton2(driver).click();
        Thread.sleep(2000);
        driver.quit();

    }

}