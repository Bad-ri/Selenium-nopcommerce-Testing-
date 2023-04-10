package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPom {
    public WebElement Category(WebDriver driver){
        By Click = By.cssSelector("a[href=\"/computers\"]");
        WebElement find = driver.findElement(Click);
        return find;
    }
    public WebElement SubCategory(WebDriver driver){
        By click = By.cssSelector("div>a[title=\"Show products in category Desktops\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
}
