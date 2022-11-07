package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_Pom {
    public WebElement open_shoe_page(WebDriver driver){
        By Click = By.cssSelector("div>a[href=\"/adidas-consortium-campus-80s-running-shoes\"]");
        WebElement find = driver.findElement(Click);
        return find;
    }
    public WebElement open_drop_list(WebDriver driver){
        By click = By.id("product_attribute_9");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement choose_size(WebDriver driver){
        By click = By.cssSelector("option[value=\"21\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement add_to_cart(WebDriver driver){
        By click = By.id("add-to-cart-button-25");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement notify_cheak(WebDriver driver){
        By click = By.cssSelector("div[id=\"bar-notification\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement open_phone_page(WebDriver driver){
        By click = By.cssSelector("a>img[title=\"Show details for HTC One M8 Android L 5.0 Lollipop\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement add(WebDriver driver){
        By click = By.cssSelector("button[id=\"add-to-cart-button-18\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement notify(WebDriver driver){
        By click = By.cssSelector("p[class=\"content\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
}
