package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPom {
    public WebElement SearchBar(WebDriver driver){
        By SB = By.id("small-searchterms");
        WebElement find = driver.findElement(SB);
        return find;
    }
    public WebElement Button(WebDriver driver){
        By button = By.cssSelector("button[type=\"submit\"]");
        WebElement find = driver.findElement(button);
        return find;
    }
}
