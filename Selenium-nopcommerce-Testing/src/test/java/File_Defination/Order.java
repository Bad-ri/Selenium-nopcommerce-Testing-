package File_Defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPom;
import pages.OrderPom;

import static File_Defination.Hooks.driver;

public class Order {
    public static void main(String[] args) {

    }

    LoginPom LP = new LoginPom();
    OrderPom OP = new OrderPom();


    @And("^USER LOGIN in the system \"(.*)\" and \"(.*)\"$")
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

    @Given("Go to Home page")
    public void user5(){
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @When("Go to electronics category and open phone subcategory")
    public void user8() throws InterruptedException {
        OP.button1(driver).click();
        OP.button2(driver).click();


    }

    @And("Choose a phone and click on add to cart button")
    public void user9() throws InterruptedException {
        Thread.sleep(2000);
        OP.button3(driver).click();
        OP.add_to_cart(driver).click();

    }

    @And("open Cart page and scroll down")
    public void user10() throws InterruptedException {
        OP.open_cart_page(driver).click();

    }

    @And("accept the terms and click on go to chekout button")
    public void user15() throws InterruptedException {
        Thread.sleep(2000);
        OP.term_check(driver).click();
        OP.chekout_page(driver).click();


    }

    @And("^Enter the personal information city \"(.*)\" address \"(.*)\" zipcode \"(.*)\" pone \"(.*)\"$")
    public void user16(String city ,String address ,String zipcode ,String pone) throws InterruptedException {
        Thread.sleep(2000);
        OP.address(driver).click();
        OP.country(driver).click();
        OP.city(driver).sendKeys(city);
        OP.address2(driver).sendKeys(address);
        OP.zip_code(driver).sendKeys(zipcode);
        OP.phone(driver).sendKeys(pone);

    }

    @And("press on continue button")
    public void user16() throws InterruptedException {
        Thread.sleep(2000);
        OP.save(driver).click();
        Thread.sleep(2000);
        OP.save1(driver).click();
        Thread.sleep(2000);
        OP.save2(driver).click();
        Thread.sleep(2000);
        OP.save3(driver).click();
        Thread.sleep(2000);
        OP.save4(driver).click();
    }

    @Then("press on continue buttons till the success message displayed")
    public void Click3() throws InterruptedException {
        String Actual = OP.check(driver).getText();
        String Expected = "Your order has been successfully processed!";
        Assert.assertFalse(Actual.contains(Expected),"Wrong data");


    }

}
