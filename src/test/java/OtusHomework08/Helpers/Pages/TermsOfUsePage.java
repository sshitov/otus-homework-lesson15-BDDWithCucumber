package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class TermsOfUsePage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = "div:nth-child(6) > div > div > h2")
    protected WebElement termsOfUsePageTitle;

    public WebElement getTermsOfUsePageTitle() {
        return termsOfUsePageTitle;
    }

    public String termsOfUsePageName(){
        return getTermsOfUsePageTitle().getText();
    }

}
