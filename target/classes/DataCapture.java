package snapDeal.testSnapDeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class DataCapture {
	File file=null;
	//*****************************Home Page **********************************
	@FindBy(xpath="//input[@data-reactid='46']")
	WebElement searchItem;
	@FindBy(xpath="//button[@data-reactid='48']")
	WebElement searchButton;
	@FindBy(xpath="//span[@class='W-gt5y']")
	WebElement searchResult;
	@FindBy(xpath="//a[@data-reactid='14']")
	WebElement homePage;
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement highlightedtext;
	//*****************************End of Home Page ***************************
	//*****************************Login Page *********************************
	@FindBy(xpath="//a[@data-reactid='60']")
	WebElement userLoginLink;
	@FindBy(xpath="//input[@class='_2zrpKA' and @type='text']")
	WebElement userEmail;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv' and @type='password']")
	WebElement userPassword;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement userLoginButton;
	@FindBy(xpath="//a[@class='_1AHrFc _2k0gmP']")
	WebElement userLoggedIn;
	//*****************************End of Login Page **************************
	//*****************************Logout Page ********************************
	@FindBy(xpath="//a[@data-reactid='28']")
	WebElement userLogoutLink;
	@FindBy(xpath="//a[@data-reactid='53']")
	WebElement userLogout;
	@FindBy(xpath="//img[@data-reactid='51']")
	WebElement flipLogo;
	//*****************************End of Logout Page *************************
	//*****************************Home Page **********************************	
	public WebElement getSearchItem(){
		return searchItem;
	}
	public WebElement getSearchButton(){
		return searchButton;
	}
	public WebElement getSearchResult(){
		return searchResult;
	}
	public WebElement getHomePage(){
		return homePage;
	}
	public WebElement getHighlightedtext(){
		return highlightedtext;
	}
	//*****************************End of Home Page ***************************
	//*****************************Login Page *********************************
	public WebElement getUserLoginLink(){
		return userLoginLink;
	}
	public WebElement getUserEmail(){
		return userEmail;
	}
	public WebElement getUserPassword(){
		return userPassword;
	}
	public WebElement getUserLoginButton(){
		return userLoginButton;
	}
	public WebElement getUserLoggedIn(){
		return userLoggedIn;
	}
	//*****************************End of Login Page **************************
	//*****************************Logout Page ********************************
	public WebElement getUserLogoutLink(){
		return userLogoutLink;
	}
	public WebElement getflipLogo(){
		file=AppBrowser.screenShot();
		return flipLogo;
	}
	public WebElement getUserLogout(){
		return userLogout;
	}
	//*****************************End of Logout Page *************************
	public void getWinScrol() throws Exception{
		AppBrowser.windowScrl(0,250);

	}

	public void nativeJsExecutor(String str){
		AppBrowser.jsExecutor(str);
	}
	
}
