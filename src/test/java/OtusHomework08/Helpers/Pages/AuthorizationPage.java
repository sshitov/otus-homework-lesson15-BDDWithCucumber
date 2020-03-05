package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationPage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = "form[class*=login] [name='email']")
    protected WebElement email;

    @FindBy(css = "form[class*=login] [name='password']")
    protected WebElement password;

    @FindBy (css = "form[class*=login] [type='submit']")
    protected WebElement submitButton;

    @FindBy (css = "[title='Забыли пароль?']")
    protected WebElement forgotPasswordLink;

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void enterLogin(String login){
        getEmail().clear();
        getEmail().sendKeys(login);
    }

    public void enterPassword(String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void authorize() {
        getSubmitButton().click();
    }

    public void openForgotPasswordForm(){
        getForgotPasswordLink().click();
    }

}
