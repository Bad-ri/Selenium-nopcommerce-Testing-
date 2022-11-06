package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPom {
    public WebElement username(WebDriver driver){
        By username = By.className("email");
        WebElement find = driver.findElement(username);
        return find;
    }
    public WebElement password(WebDriver driver){
        By password = By.className("password");
        WebElement find = driver.findElement(password);
        return find;
    }

}
