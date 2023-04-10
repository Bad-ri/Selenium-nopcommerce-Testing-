package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrencyPom {
    public WebElement click(WebDriver driver){
        By Click = By.id("customerCurrency");
        WebElement find = driver.findElement(Click);
        return find;
    }
    public WebElement Click2(WebDriver driver){
        By click = By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
}
