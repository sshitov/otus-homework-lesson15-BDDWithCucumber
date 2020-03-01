package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.RecruitersPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ReturnToTheMainPage extends BaseTests {

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected RecruitersPage recruitersPage;

    @Given("I'm in the recruiter page")
    public void iMInTheRecruiterPage() {
        mainPage.init();

        mainPage.openMainPage();
        mainPage.navigateToRecruiterPage();
    }

    @When("I click to logo in the header")
    public void iClickToLogoInTheHeader() {
        recruitersPage.init();

        recruitersPage.navigateToMainPage();
    }

    @Then("I see the main page")
    public void iSeeTheMainPage() {
        Assert.assertEquals("https://otus.ru/", currentUrl());
    }
}
