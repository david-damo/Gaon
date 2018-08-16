package steps.dfinitions.com;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

/**
 * Created by Sanjeev on 3/25/2018.
 */
public class Hooks {
    private static final Logger logger = Logger.getLogger("Log4JSettings");
    public static WebDriver driver;
    private static boolean initialized = false;

    @Before
    public void browserLauncher() throws MalformedURLException {
        logger.info("Deleting cookies from browser and launching it.");
        if (!initialized){
            initialized = true;
            driver = new FirefoxDriver();
            driver.manage().deleteAllCookies();
        }
        //driver=new FirefoxDriver();
        //driver.manage().deleteAllCookies();
    }
    @After
    public void embedScreenShotsAndCloseBrowser(Scenario scenario ){
        if(scenario.isFailed()){
            logger.info("Taking screenshot of "+scenario+" as it failed");
            byte[] screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshots,"images/png");
            logger.info("Quiting the browser....");
            //driver.quit();
        }
        else{
            scenario.write("Scenario is Passed");
        }
    }
}
