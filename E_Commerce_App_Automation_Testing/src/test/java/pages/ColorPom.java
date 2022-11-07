package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColorPom {
    public WebElement ApparelCategory(WebDriver driver){
        By Click = By.cssSelector("a[href=\"/apparel\"]");
        WebElement find = driver.findElement(Click);
        return find;
    }
    public WebElement ShoesCategory(WebDriver driver){
        By click = By.cssSelector("img[alt=\"Picture for category Shoes\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement Color(WebDriver driver){
        By Click = By.id("attribute-option-15");
        WebElement find = driver.findElement(Click);
        return find;
    }

}
