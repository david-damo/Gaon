package steps.dfinitions.com;

/**
 * Created by Sanjeev on 3/25/2018.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/com/2-eBayLogout.feature"},
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:results/cucumber.json",
                "junit:results/cucumber.xml"},

        tags = {}
)
public class eBayLogoutRunner {
}
