package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class NavigateToFacebookPageFromSite extends BaseTests {

    @Autowired
    protected MainPage mainPage;

    @Given("I'm In the main page")
    public void iMInTheMainPages() {
        mainPage.init();

        mainPage.openMainPage();
    }

    @When("I click 'Facebook' link")
    public void iClickFacebookLink() {
        mainPage.navigateToFacebookPage();
    }

    @Then("I see Facebook page")
    public void iSeeFacebookPage() {
        selectBrowserTab(1);
        Assert.assertEquals("https://www.facebook.com/otusru/", currentUrl());
    }
}
