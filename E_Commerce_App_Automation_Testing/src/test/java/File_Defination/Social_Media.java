package File_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.SocialPom;

import static File_Defination.Hooks.driver;

public class Social_Media {
    public static void main(String[] args) {

    }

    SocialPom SP = new SocialPom();

    @Given("open Home page")
    public void Home(){
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @When("click on facebook icon")
    public void facebook(){
        SP.facebook(driver).click();

    }

    @Then("Successfully open facebook page")
    public void facebook1() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.facebook.com/nopCommerce";
        Assert.assertFalse(Actual.contains(Expected),"Wrong Data");
        driver.findElement(By.cssSelector("body")).
                sendKeys(Keys.LEFT_CONTROL + "W");
        Home();
    }

    @When("click on Twitter icon")
    public void twitter(){

        SP.twitter(driver).click();


    }

    @Then("Successfully open twitter page")
    public void twitter1() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = driver.getCurrentUrl();
        String Expected = "https://twitter.com/nopCommerce";
        Assert.assertFalse(Actual.contains(Expected),"Wrong Data");
        Thread.sleep(1000);
        Home();
    }

    @When("click on Youtube icon")
    public void youtube(){
        SP.youtube(driver).click();

    }

    @Then("Successfully open youtube page")
    public void youtube1() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.youtube.com/user/nopCommerce";
        Assert.assertFalse(Actual.contains(Expected),"Wrong Data");
        Thread.sleep(1000);
        Home();
    }

    @When("click on Rss icon")
    public void rss(){

        SP.rss(driver).click();

    }

    @Then("Successfully open rss page")
    public void rss1() throws InterruptedException {
        Thread.sleep(2000);
        String Actual = driver.getCurrentUrl();
        String Expected = "http://demo.nopcommerce.com/news/rss/1";
        Assert.assertFalse(Actual.contains(Expected),"Wrong Data");
        Thread.sleep(1000);
        Home();
    }

}
