package File_Defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPom;

import static File_Defination.Hooks.driver;

public class Login {
    LoginPom LP = new LoginPom();

    public static void main(String[] args) {

    }

    @When("navigate to the login page")
    public void navigation(){

        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @And("^User enter a valid email and password \"(.*)\" and \"(.*)\"$")
    public void enter(String email , String Pass){
        LP.username(driver).sendKeys(email);
        LP.password(driver).sendKeys(Pass);
    }

    @And("User click on login button")
    public void click() throws InterruptedException {
        Thread.sleep(2000);
        LP.Click(driver).click();
        Thread.sleep(2000);

    }

    @Then("successfully message will displayed")
    public void successfully_message_will_displayed() throws InterruptedException {
        String Actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/login?returnurl=%2F";
        Assert.assertFalse(Actual.contains(Expected),"Logged in");
    }


}
