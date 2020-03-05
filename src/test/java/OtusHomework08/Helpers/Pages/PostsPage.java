package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class PostsPage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = ":nth-child(1) > div > div > .nav__float-left a:nth-child(1)")
    protected WebElement blogLink;

    @FindBy(css = "[href='/nest/fqa/'] [class*='icon']")
    protected WebElement qaFilter;

    @FindBy(css = ".container-padding-bottom-half .blog__h1")
    protected WebElement blogPageTitle;

    public WebElement getBlogLink() {
        return blogLink;
    }

    public WebElement getQaFilter() {
        return qaFilter;
    }

    public WebElement getBlogPageTitle() {
        return blogPageTitle;
    }

    public void navigateToBlog(){
        getBlogLink().click();
    }

    public void selectQAFilter(){
        getQaFilter().click();
    }

    public String blogPageName(){
        return getBlogPageTitle().getText();
    }
}
