package steps.dfinitions.com;

/**
 * Created by Sanjeev on 3/25/2018.
 */
import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import java.io.*;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/com/1-Page-Title.feature"},
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"},
        tags = {}
)
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/com/1-Page-Title.feature"},
        tags = {},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
*/

public class RunTest {
    /*static ConfigFileReader myfile=new ConfigFileReader();
    @AfterClass
    public static void writeExtentReport() throws Exception{
        //Reporter.loadXMLConfig(new File("config/report.xml"));
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        //System.out.println("From TestRun "+myfile.hostConfig.getProperty("reportConfigPath"));

        //String str=myfile.hostConfig.getProperty("reportConfigPath");
        //System.out.println("Path "+str);
        //Reporter.loadXMLConfig(str);
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        Reporter.loadXMLConfig(new File("extent-report.xml"));
    }*/
    @AfterClass
    public static void teardown() {

        /*Reporter.loadXMLConfig(new File("target/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");*/
    }
}
