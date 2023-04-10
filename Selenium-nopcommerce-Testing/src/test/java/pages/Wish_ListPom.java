package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wish_ListPom {
    public WebElement WishButton(WebDriver driver){
        By Click = By.id("add-to-wishlist-button-25");
        WebElement find = driver.findElement(Click);
        return find;
    }
    public WebElement WishButton2(WebDriver driver){
        By click = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement notify2(WebDriver driver){
        By click = By.cssSelector("#bar-notification > div > p");
        WebElement find = driver.findElement(click);
        return find;
    }

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


    public WebElement open_phone_page(WebDriver driver){
        By click = By.cssSelector("a>img[title=\"Show details for HTC One M8 Android L 5.0 Lollipop\"]");
        WebElement find = driver.findElement(click);
        return find;
    }



}
