package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class CoursesPage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(css = ".title-new__text h1")
    protected WebElement courseCategoryTitle;

    public WebElement getCourseCategoryTitle() {
        return courseCategoryTitle;
    }

    public String courseCategoryName(){
        return getCourseCategoryTitle().getText();
    }

}
