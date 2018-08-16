package steps.dfinitions.com;

import cucumber.api.CucumberOptions;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by Sanjeev on 7/27/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/com/1-Page-Title.feature"},
        tags = {},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class myTest {
    public static void main(String[] args) throws Throwable {

        //Your code to get feature file full path

        Main.main(new String[]{"-g", "", "C:\\Amy\\flashAuto\\ratesust\\src\\test\\java\\features\\com\\"});


        // My stepdefinition is inside java package at cucumber.sample.test
        // My feature file is inside src/test/resources/features/samplethree.feature

    }

}
