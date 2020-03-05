package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class RestorePasswordPage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = ":nth-child(5) .new-input-line_relative input")
    protected WebElement email;

    @FindBy (css = ":nth-child(5) :nth-child(6) button")
    protected WebElement submitButton;

    @FindBy(css = "[class*='modal__success']")
    protected WebElement successSendMessage;

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSuccessSendMessage() {
        return successSendMessage;
    }

    public void enterEmail(String email){
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void submitRestorePasswordQuery() {
        getSubmitButton().click();
    }

    public boolean successSandMessageIsPresent(){
        return getSuccessSendMessage().isDisplayed();
    }

}
