package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags = "@testCase2",
        plugin = {"pretty", "html:target/Cucumber.html", "json:target/Cucumber.json"}
)

public class SmokeRunner {
}

//tags option will execute the tagged testcase as mention in your runner class
//target folder is mostly used for sorting the test case execution reports generated using cucumber