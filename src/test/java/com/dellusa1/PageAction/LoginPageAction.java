package com.dellusa1.PageAction;



import org.testng.Assert;

import com.dellusa1.PageLocator.LoginPageLOcator;
import com.dellusa1.Util.TestBaseDell;

public class LoginPageAction extends TestBaseDell {
	
	LoginPageLOcator loginPageLocator=new LoginPageLOcator();
	public void usercard(String u,String p) {
		loginPageLocator.Email.sendKeys(u);
		loginPageLocator.pass.sendKeys(p);
		loginPageLocator.login.click();
	}
public void verifyusercanlogin() {
	boolean loginverification= loginPageLocator.verifylogin.isDisplayed();
	Assert.assertTrue(loginverification);
}

}