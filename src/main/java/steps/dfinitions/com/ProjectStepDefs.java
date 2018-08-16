package steps.dfinitions.com;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebay.modules.homePageSignIn;
import ebay.modules.homePageSignOut;
import ebay.pages.HomePageEbay;
import ebay.pages.SignOutPageEbay;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Sanjeev on 3/25/2018.
 */
public class ProjectStepDefs {
    public WebDriver driver;
    public ProjectStepDefs(){
        driver=Hooks.driver;
    }
    @When("^I open ebay website")
    public void i_open_seleniumframework_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.ebay.in/");
    }
    @Then("^I validate title and URL")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay",driver.getTitle());
        assertEquals("https://www.ebay.in/",driver.getCurrentUrl());
    }
    @When("^I click My eBay")
    public void clickMyEbayLink() throws Throwable {
        PageFactory.initElements(driver,HomePageEbay.class);
        homePageSignIn.Execute(driver);
    }
    @Then("^I enter username and password")
    public void loginAtEbay() throws Throwable {
        homePageSignIn.loginInput(driver);
    }
    @Then("^I will uncheck Stay signed in")
    public void loginAtEbayUncheck() throws Throwable {
        homePageSignIn.loginInputUncheck(driver);
    }
    @Then("^I will click on Sign in button")
    public void loginAtEbaySubmit() throws Throwable {
        homePageSignIn.loginInputSubmit(driver);
    }
    @When("^I check my link")
    public void checkMyLink() throws Throwable {
        homePageSignIn.chkMyLink(driver);
    }
    @When("^I will click Hi Username dropdown")
    public void userProfLink() throws Throwable {
        PageFactory.initElements(driver,SignOutPageEbay.class);
        homePageSignOut.UserProfile(driver);
    }
    @Then("^I click to be deleted")
    public void toBeDeleted() throws Throwable {
        homePageSignOut.toBeDeleted(driver);
    }
    @Then("^I click logout link")
    public void userLogoutLink() throws Throwable {
        homePageSignOut.UserSignOut(driver);
    }

}
