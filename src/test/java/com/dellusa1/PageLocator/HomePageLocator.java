package com.dellusa1.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.dellusa1.Util.TestBaseDell;

public class HomePageLocator extends TestBaseDell{
	
	public HomePageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(how=How.XPATH, using="//input[@class=\"mh-search-input\"]")
	public WebElement Searchfield;

	@FindBy(how=How.XPATH, using="//span[@class=\"mh-search-button-label\"]")
	public WebElement Searchlink;
	
	@FindBy(how=How.XPATH, using="//h2[@class=\"direct-content__title\"]")
	public WebElement searchverifyresult;
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement Singninbutton;
	
	@FindBy(how=How.LINK_TEXT , using="Sign In")
	public WebElement signinlink;
	
}


