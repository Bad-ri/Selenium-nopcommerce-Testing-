package Functionality;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.ForgetPom;

public class Forget_Password {
    WebDriver driver = null;
    ForgetPom FP = new ForgetPom();

    public static void main(String[] args) {

    }

    @Given("user open browser3")
    public void user_open_the_browser(){
        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @When("user navigate to Password recovery page")
    public void navigate(){

        driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
    }


    @And("^user enter a valid Email \"(.*)\"$")
    public void navigate3(String email){

        FP.Email(driver).sendKeys(email);
    }


    @And("user click on recover button")
    public void navigate6(){

        FP.Click(driver).click();

    }

    @Then("a successful message will be displayed to the user")
    public void noti7() throws InterruptedException {

        String Actual = driver.findElement(By.className("content")).getText();
        String Expected = "Email with instructions has been sent to you.";
        Assert.assertTrue(Actual.contains(Expected),"Error message = Email dos not exict");
        Thread.sleep(2000);
        driver.quit();

    }
}
