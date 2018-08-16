package ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sanjeev on 3/25/2018.
 */
public class SignOutPageEbay extends BaseClass {
    public SignOutPageEbay(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[@id='gh-ug']")
    public static WebElement userProfileLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Sign outt']")
    public static WebElement signOut;
}