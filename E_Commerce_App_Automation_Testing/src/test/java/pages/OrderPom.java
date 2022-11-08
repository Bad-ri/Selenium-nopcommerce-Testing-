package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPom {
    public WebElement button1(WebDriver driver){
        By click = By.cssSelector("li>a[href=\"/electronics\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement button2(WebDriver driver){
        By click = By.cssSelector("div>a[href=\"/cell-phones\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement button3(WebDriver driver){
        By click = By.cssSelector("div>a[href=\"/nokia-lumia-1020\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement add_to_cart(WebDriver driver){
        By click = By.cssSelector("button[id=\"add-to-cart-button-20\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement open_cart_page(WebDriver driver){
        By click = By.cssSelector("li>a[href=\"/cart\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement term_check(WebDriver driver){
        By click = By.cssSelector("input[id=\"termsofservice\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement chekout_page(WebDriver driver){
        By click = By.cssSelector("button[id=\"checkout\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement address(WebDriver driver){
        By click = By.id("BillingNewAddress_CountryId");
        WebElement find = driver.findElement(click);
        return find;
    }
    public  WebElement country(WebDriver driver){
        By click = By.cssSelector("option[value=\"211\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement state(WebDriver driver){
        By click = By.id("BillingNewAddress_StateProvinceId");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement city(WebDriver driver){
        By click = By.id("BillingNewAddress_City");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement address2(WebDriver driver){
        By click = By.id("BillingNewAddress_Address1");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement zip_code(WebDriver driver){
        By click = By.id("BillingNewAddress_ZipPostalCode");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement phone(WebDriver driver){
        By click = By.id("BillingNewAddress_PhoneNumber");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement save(WebDriver driver){
        By click = By.cssSelector("button[name=\"save\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement save1(WebDriver driver){
        By click = By.xpath("//button[@type=\"button\"][@class=\"button-1 shipping-method-next-step-button\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement save2(WebDriver driver){
        By click = By.xpath("//button[@type=\"button\"][@class=\"button-1 payment-method-next-step-button\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement save3(WebDriver driver){
        By click = By.xpath("//button[@type=\"button\"][@class=\"button-1 payment-info-next-step-button\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement save4(WebDriver driver){
        By click = By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement check(WebDriver driver){
        By click = By.cssSelector("div[class=\"title\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
}