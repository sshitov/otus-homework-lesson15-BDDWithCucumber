package OtusHomework08.Tests;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;

import java.util.ArrayList;


public class BaseTests {

    public String currentUrl(){
        return ChromeWebDriver.getDriver().getCurrentUrl();
    }

    public ArrayList<String> getBrowserTabs(){
        return new ArrayList<>(ChromeWebDriver.getDriver().getWindowHandles());
    }

    public void selectBrowserTab(int index){
        ChromeWebDriver.getDriver().switchTo().window(getBrowserTabs().get(index));
    }

}
