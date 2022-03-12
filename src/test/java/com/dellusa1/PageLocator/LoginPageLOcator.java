package com.dellusa1.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.dellusa1.Util.TestBaseDell;

public class LoginPageLOcator extends TestBaseDell {

	public LoginPageLOcator() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "EmailAddress")
	public WebElement Email;

	@FindBy(how = How.ID, using = "Password")
	public WebElement pass;
	@FindBy(how = How.XPATH, using = "//button[@id=\"sign-in-button\"]")
	public WebElement login;
	@FindBy(how = How.XPATH, using = "//span[text()='resma khatun']")
	public WebElement verifylogin;

}
