package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.TermsOfUsePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class NavigateToTheTermsOfUsePage extends BaseTests {

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected TermsOfUsePage termsOfUsePage;

    @Given("I'm in the Main page")
    public void iMInTheMainPage() {
        mainPage.init();

        mainPage.openMainPage();
    }

    @When("I click 'Terms of use' link")
    public void iClickTermsOfUseLink() {
        mainPage.navigateToTermsOfUsePage();
    }

    @Then("I see the 'Terms of use' page")
    public void iSeeTheTermsOfUsePage() {
        termsOfUsePage.init();

        Assert.assertEquals("Пользовательское соглашение", termsOfUsePage.termsOfUsePageName());
    }
}
