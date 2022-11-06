package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPom {
    public WebElement Fname(WebDriver driver){
        WebElement find = driver.findElement(By.id("FirstName"));
        return find;
    }
    public WebElement Sname(WebDriver driver){
        WebElement find = driver.findElement(By.id("LastName"));
        return find;
    }
    public WebElement Email(WebDriver driver){
        WebElement find = driver.findElement(By.id("Email"));
        return find;
    }
    public WebElement Password(WebDriver driver){
        WebElement find = driver.findElement(By.id("Password"));
        return find;
    }
    public WebElement Rpassword(WebDriver driver){
        WebElement find = driver.findElement(By.id("ConfirmPassword"));
        return find;
    }

    public WebElement Click(WebDriver driver){
        WebElement button = driver.findElement(By.id("register-button"));
        return button;
    }
}
