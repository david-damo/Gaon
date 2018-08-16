package ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import steps.dfinitions.com.Hooks;

/**
 * Created by Sanjeev on 3/25/2018.
 */
public class HomePageEbay extends BaseClass{
    public HomePageEbay(WebDriver driver){
        super(driver);
    }
    @FindBy(how= How.XPATH, using="//li[@id='gh-eb-My']")
        public static WebElement callSignInPageOrPopup;

    @FindBy(how= How.XPATH, using="//input[@id='userid']")
    public static WebElement userId;
    @FindBy(how= How.XPATH, using="//input[@id='pass']")
    public static WebElement pass;
    @FindBy(how= How.XPATH, using="//span[@id='csi']")
    public static WebElement uncheckSignin;
    @FindBy(how= How.XPATH, using="//button[@id='sgnBt']")
    public static WebElement loginInputSubmit;
    @FindBy(xpath="/images/myLink.png")
    public static WebElement matchimgMyLink;
}
