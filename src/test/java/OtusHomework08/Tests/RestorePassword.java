package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.AuthorizationPage;
import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.RestorePasswordPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class RestorePassword extends BaseTests {

    @Value("${email}")
    protected String email;

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected AuthorizationPage authorizationPage;

    @Autowired
    protected RestorePasswordPage restorePasswordPage;

    @Given("I'm open restore password form")
    public void iMOpenRestorePasswordForm() throws InterruptedException {
        mainPage.init();
        authorizationPage.init();

        mainPage.openMainPage();
        mainPage.openAuthorizationPage();
        Thread.sleep(500);
        authorizationPage.openForgotPasswordForm();
    }

    @When("I fill the email")
    public void iFillTheEmail() {
        restorePasswordPage.init();

        restorePasswordPage.enterEmail(email);
    }

    @And("I click submit")
    public void iClickSubmit() {
        restorePasswordPage.submitRestorePasswordQuery();
    }

    @Then("I see the message that notification is sent")
    public void iSeeTheMessageThatNotificationIsSent() {
        Assert.assertTrue(restorePasswordPage.successSandMessageIsPresent());
    }
}
