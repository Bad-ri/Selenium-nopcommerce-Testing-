package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialPom {

    public WebElement facebook(WebDriver driver){
        By click = new By.ByCssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement twitter(WebDriver driver){
        By click = new By.ByCssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement youtube(WebDriver driver){
        By click = new By.ByCssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
        WebElement find = driver.findElement(click);
        return find;
    }
    public WebElement rss(WebDriver driver){
        By click = new By.ByCssSelector("a[href=\"/news/rss/1\"]");
        WebElement find = driver.findElement(click);
        return find;
    }

}
