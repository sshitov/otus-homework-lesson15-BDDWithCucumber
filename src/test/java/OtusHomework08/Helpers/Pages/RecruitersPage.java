package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class RecruitersPage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = ".ri-header__text-box [data-modal-id='recruiters-invite']")
    protected WebElement cooperateLink;

    @FindBy(css = ".js-content [name='fullname']")
    protected WebElement fullName;

    @FindBy(css = ".js-content [name='phone']")
    protected WebElement phoneNumber;

    @FindBy(css = ".js-content [name='email']")
    protected WebElement email;

    @FindBy(css = ".js-content button")
    protected WebElement submitButton;

    @FindBy(css = "[class*='success-header']")
    protected WebElement successSendMessage;

    @FindBy(css = "[class='header2__logo-img']")
    protected WebElement mainPageLink;

    public WebElement getMainPageLink() {
        return mainPageLink;
    }

    public WebElement getCooperateLink() {
        return cooperateLink;
    }

    public WebElement getFullName() {
        return fullName;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSuccessSendMessage() {
        return successSendMessage;
    }

    public void navigateToMainPage(){
        getMainPageLink().click();
    }

    public void openCooperateForm(){
        getCooperateLink().click();
    }

    public void fillTheForm(String fullName, String phoneNumber, String email){
        getFullName().clear();
        getFullName().sendKeys(fullName);
        getPhoneNumber().clear();
        getPhoneNumber().sendKeys(phoneNumber);
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void submitCooperateForm(){
        getSubmitButton().click();
    }

    public boolean successSandMessageIsPresent(){
        return getSuccessSendMessage().isDisplayed();
    }
}
