package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.AuthorizationPage;
import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.PersonalProfilePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class OpenPersonalProfilePage extends BaseTests {

    @Value("${email}")
    protected String email;

    @Value("${password}")
    protected String password;

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected AuthorizationPage authorizationPage;

    @Autowired
    protected PersonalProfilePage personalProfilePage;

    @Given("I'm on the main page and authorized")
    public void iMOnTheMainPageAndAuthorized() {
        mainPage.init();
        authorizationPage.init();

        mainPage.openMainPage();
        mainPage.openAuthorizationPage();
        authorizationPage.enterLogin(email);
        authorizationPage.enterPassword(password);
        authorizationPage.authorize();
    }

    @When("I click 'My profile' link")
    public void iClickMyProfileLink() {
        mainPage.openProfilePage();
    }

    @Then("I see text 'profile data'")
    public void iSeeProfileDataText() {
        personalProfilePage.init();

        Assert.assertEquals("Персональные данные", personalProfilePage.personalProfilePageName());
    }
}
