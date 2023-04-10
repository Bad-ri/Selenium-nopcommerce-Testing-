package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagsPom {
    public WebElement Choose_tag(WebDriver driver){
        By Click = By.cssSelector("a[href=\"/awesome\"]");
        WebElement find = driver.findElement(Click);
        return find;
    }
}

