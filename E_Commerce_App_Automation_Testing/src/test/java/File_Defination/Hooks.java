package File_Defination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static void main(String[] args) {

    }
    static WebDriver driver;

    @Before
    public static void openChromeBrowser(){
        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown(){
        driver.quit();
    }
}
