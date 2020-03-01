package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PersonalProfilePage {

    @PostConstruct
    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = "[class*=text_pad]")
    protected WebElement personalProfilePageTitle;

    public WebElement getPersonalProfilePageTitle() {
        return personalProfilePageTitle;
    }

    public String personalProfilePageName(){
        return getPersonalProfilePageTitle().getText();
    }

}
