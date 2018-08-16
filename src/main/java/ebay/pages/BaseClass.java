package ebay.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Sanjeev on 3/25/2018.
 */
public abstract class BaseClass {
    public static WebDriver driver;
    public static boolean bResult;
    public BaseClass(WebDriver driver){
        BaseClass.driver=driver;
        BaseClass.bResult=true;
    }
}
