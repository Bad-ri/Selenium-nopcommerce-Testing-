package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPom {
    public WebElement Email(WebDriver driver){
        WebElement find = driver.findElement(By.className("email"));
        return find;
    }
    public WebElement Click(WebDriver driver){
        WebElement button = driver.findElement(By.cssSelector("div>button[type=\"submit\"]"));
        return button;
    }

}
