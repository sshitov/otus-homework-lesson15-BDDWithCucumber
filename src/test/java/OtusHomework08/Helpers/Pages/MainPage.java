package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage {

    @Value("${baseUrl}")
    protected String baseUrl;

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = "[class*='auth'] button")
    protected WebElement loginButton;

    @FindBy (css = ".header2__right p")
    protected WebElement userName;

    @FindBy (css = ".header2-menu__dropdown-text_name")
    protected WebElement myProfile;

    @FindBy(css = "[id='categories_id'] [title='Тестирование']")
    protected WebElement testingCoursesLink;

    @FindBy(css = ".header2_subheader-container__right [title='Блог']")
    protected WebElement blogSectionLink;

    @FindBy(css = "[class='footer2__container container'] [href='/legal/terms/']")
    protected WebElement termsOfUseLink;

    @FindBy(css = ".header2_subheader-container__right [title='Рекрутерам']")
    protected WebElement recruiterSectionLink;

    @FindBy(css = "[class='footer2__container container'] [name='email']")
    protected WebElement subscribeEmailField;

    @FindBy(css = "[class='footer2__container container'] button")
    protected WebElement subscribeSubmitButton;

    @FindBy(css = ".subscribe-modal__success")
    protected WebElement successSubscribeMessage;

    public WebElement getTermsOfUseLink() {
        return termsOfUseLink;
    }

    public WebElement getRecruiterSectionLink() {
        return recruiterSectionLink;
    }

    public WebElement getSubscribeEmailField() {
        return subscribeEmailField;
    }

    public WebElement getSubscribeSubmitButton() {
        return subscribeSubmitButton;
    }

    public WebElement getSuccessSubscribeMessage() {
        return successSubscribeMessage;
    }

    public WebElement getBlogSectionLink() {
        return blogSectionLink;
    }

    public WebElement getTestingCoursesLink() {
        return testingCoursesLink;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getUserName() { return userName; }

    public WebElement getMyProfile() {
        return myProfile;
    }

    public void openMainPage(){
        ChromeWebDriver.getDriver().get(getBaseUrl());
    }

    public void openAuthorizationPage() {
        getLoginButton().click();
    }

    public void openProfilePage() {
        ChromeWebDriver.getWait().until(ExpectedConditions.visibilityOf(getUserName()));
        ChromeWebDriver.getAction().moveToElement(getUserName()).perform();
        getMyProfile().click();
    }

    public void navigateToCoursesPageFilteredByTesting(){
        getTestingCoursesLink().click();
    }

    public void navigateToBlogPage(){
        getBlogSectionLink().click();
    }

    public void navigateToFacebookPage(){
        String script = "document.querySelector(\"[class='footer2__container container'] [class*='fb']\").click();";
        ((JavascriptExecutor) ChromeWebDriver.getDriver()).executeScript(script);
    }

    public void navigateToTermsOfUsePage(){
        getTermsOfUseLink().click();
    }

    public void navigateToRecruiterPage(){
        getRecruiterSectionLink().click();
    }

    public void fillTheSubscribeField(String email){
        getSubscribeEmailField().clear();
        getSubscribeEmailField().sendKeys(email);
    }

    public void submitSubscribeForm(){
        getSubscribeSubmitButton().click();
    }

    public boolean successSubscribeMessageIsPresent(){
        return getSuccessSubscribeMessage().isDisplayed();
    }

    public boolean userNameIsPresent(){
        return getUserName().isDisplayed();
    }

}
