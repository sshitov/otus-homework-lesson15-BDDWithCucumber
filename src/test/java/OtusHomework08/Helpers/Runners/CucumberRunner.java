package OtusHomework08.Helpers.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/OtusHomework08/Helpers/FeatureFiles",
        glue = {"OtusHomework08/Tests"}
)
public class CucumberRunner {
}
