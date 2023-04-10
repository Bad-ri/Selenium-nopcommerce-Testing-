package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparePom {
    public WebElement CompareButton(WebDriver driver){
        By Click = By.cssSelector("#product-details-form > div:nth-child(2) > div.product-essential > div.overview > div.overview-buttons > div.compare-products > button");
        WebElement find = driver.findElement(Click);
        return find;
    }
    public WebElement CompareButton2(WebDriver driver){
        By click = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement notify(WebDriver driver){
        By click = By.cssSelector("#bar-notification > div > p");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement open_shoe_page(WebDriver driver){
        By Click = By.cssSelector("div>a[href=\"/adidas-consortium-campus-80s-running-shoes\"]");
        WebElement find = driver.findElement(Click);
        return find;
    }
}
