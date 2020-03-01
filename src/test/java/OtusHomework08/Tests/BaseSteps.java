package OtusHomework08.Tests;

import OtusHomework08.Helpers.Config.SpringConfig;
import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = SpringConfig.class)
public class BaseSteps {

    @Before
    public void before() {
        ChromeWebDriver.driverLoad();
        ChromeWebDriver.driverCreate();
    }

    @After
    public void after() {ChromeWebDriver.quit();}

}
