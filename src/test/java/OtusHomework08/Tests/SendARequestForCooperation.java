package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.RecruitersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SendARequestForCooperation extends BaseTests {

    @Value("${testEmail}")
    protected String email;

    @Value("${phoneNumber}")
    protected String phoneNumber;

    @Value("${fullName}")
    protected String fullName;

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected RecruitersPage recruitersPage;

    @Given("I'm in the recruiters page")
    public void iMInTheRecruitersPage() {
        mainPage.init();

        mainPage.openMainPage();
        mainPage.navigateToRecruiterPage();
    }

    @When("I click 'cooperate' link")
    public void iClickCooperateLink() {
        recruitersPage.init();

        recruitersPage.openCooperateForm();
    }

    @And("I fill all required fields on the form")
    public void iFillTheAllRequiredFieldsOnTheForm() {
        recruitersPage.fillTheForm(fullName,phoneNumber,email);
    }

    @And("I submit form")
    public void iSubmitTheForm() {
        recruitersPage.submitCooperateForm();
    }

    @Then("I see a message that the application sent")
    public void iSeeAMessageThatTheApplicationSent() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(recruitersPage.successSandMessageIsPresent());
    }
}
