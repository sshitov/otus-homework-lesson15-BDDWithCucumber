package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SubscribeToNewsNotifications extends BaseTests {

    @Value("${testEmail}")
    protected String email;

    @Autowired
    protected MainPage mainPage;

    @Given("I'm in the main page")
    public void iMInTheMainPages() {
        mainPage.init();

        mainPage.openMainPage();
    }

    @When("I fill the subscribe field")
    public void iFillTheSubscribeField() {
        mainPage.fillTheSubscribeField(email);
    }

    @And("I click 'subscribe' link")
    public void iClickSubscribeLink() {
        mainPage.submitSubscribeForm();
    }

    @Then("I see the 'You success subscribed' message")
    public void iSeeTheSuccessSubscribedMessage() {
        Assert.assertTrue(mainPage.successSubscribeMessageIsPresent());
    }
}
