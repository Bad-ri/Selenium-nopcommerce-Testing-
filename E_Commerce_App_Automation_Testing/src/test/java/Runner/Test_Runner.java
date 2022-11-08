package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\Feature",
        glue = "Functionality",
        tags = "@ZLATAN",
        plugin = { "pretty", "html:test-output/cucumber-reports.HTML" },
        monochrome = true

)
public class Test_Runner {


}
