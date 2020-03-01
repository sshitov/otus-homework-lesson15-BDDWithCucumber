package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.AuthorizationPage;
import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class AuthorizationOnPage extends BaseTests {

    @Value("${email}")
    protected String email;

    @Value("${password}")
    protected String password;

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected AuthorizationPage authorizationPage;

    @Given("I'm in the authorization page")
    public void iMInTheAuthorizationPage() {
        mainPage.init();

        mainPage.openMainPage();
        mainPage.openAuthorizationPage();
    }

    @When("I fill the all required fields on the form")
    public void iFillTheAllRequiredFieldsOnTheForm() {
        authorizationPage.init();


        authorizationPage.enterLogin(email);
        authorizationPage.enterPassword(password);
    }

    @And("I submit the form")
    public void iSubmitTheForm() {
        authorizationPage.authorize();
    }

    @Then("I see profile name in the header")
    public void iSeeProfileNameInTheHeader() {
        Assert.assertTrue(mainPage.userNameIsPresent());
    }

}
