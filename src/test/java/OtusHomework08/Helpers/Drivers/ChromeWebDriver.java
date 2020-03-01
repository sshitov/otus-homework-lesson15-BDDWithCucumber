package OtusHomework08.Helpers.Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ChromeWebDriver {

  protected static WebDriver driver;
  protected static Actions action;
  protected static WebDriverWait wait;

    public static WebDriverWait getWait() {
        return wait;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static Actions getAction() {
        return action;
    }

    public static void driverLoad(){
        WebDriverManager.chromedriver().setup();
    }

    public static void driverCreate(){
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      wait = new WebDriverWait(driver, 5);
      action = new Actions(driver);
    }

    public static void quit(){
        if (driver != null) {
            driver.quit();
        }
    }

}
