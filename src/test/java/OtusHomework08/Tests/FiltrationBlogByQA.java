package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.PostsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class FiltrationBlogByQA extends BaseTests {

    @Autowired
    protected MainPage mainPage;

    @Autowired
    protected PostsPage postsPage;

    @Given("I'm on the posts page")
    public void iMOnThePostsPage() {
        mainPage.init();

        mainPage.openMainPage();
        mainPage.navigateToBlogPage();
    }

    @When("I navigate to 'Blog'")
    public void iNavigateToBlog() {
        postsPage.init();

        postsPage.navigateToBlog();
    }

    @And("I select QA")
    public void iSelectQA() {
        postsPage.selectQAFilter();
    }

    @Then("I see in the page header 'QA and testing'")
    public void iSeeQAInThePageHeader() {
        Assert.assertEquals("Блог QA и тестирование", postsPage.blogPageName());
    }
}
