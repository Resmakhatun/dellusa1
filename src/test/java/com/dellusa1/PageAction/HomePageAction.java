package com.dellusa1.PageAction;



import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.dellusa1.PageLocator.HomePageLocator;
import com.dellusa1.Util.TestBaseDell;
import com.dellusa1.Util.TestData;
import com.dellusa1.Util.UtillDell;

public class HomePageAction extends TestBaseDell{

HomePageLocator homePageLocator= new HomePageLocator();

	public void	EnterxpsinSearchfield() {
		homePageLocator.Searchfield.sendKeys(UtillDell.laptop);
		}
	public void clickonSearchlink() {
		homePageLocator.Searchlink.click();
	}
	public void searchverifyresultdisplay() {
		boolean abc =homePageLocator.searchverifyresult.isDisplayed();
		Assert.assertTrue(abc);
	}
	public void  ClickonSigninbutton() {
		homePageLocator.Singninbutton.click();
	}
	
public void  Clicksigninlink() {
	homePageLocator.signinlink.click();
}
	
	}

	

		

