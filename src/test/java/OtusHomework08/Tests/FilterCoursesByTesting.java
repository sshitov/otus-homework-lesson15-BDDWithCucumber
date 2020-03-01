package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.CoursesPage;
import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class FilterCoursesByTesting extends BaseTests {

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected CoursesPage coursesPage;

    @Given("Im in the main page")
    public void iMInTheMainPage() {
        mainPage.init();

        mainPage.openMainPage();
    }

    @When("I click testing link")
    public void iClickTestingLink() {
        mainPage.navigateToCoursesPageFilteredByTesting();
    }

    @Then("I see the page that filtered by testing")
    public void iSeeThePageThatFilteredByTesting() {
        coursesPage.init();

        Assert.assertEquals("Тестирование", coursesPage.courseCategoryName());
    }
}
