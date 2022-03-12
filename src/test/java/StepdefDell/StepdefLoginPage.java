package StepdefDell;

import com.dellusa1.PageAction.HomePageAction;
import com.dellusa1.PageAction.LoginPageAction;
import com.dellusa1.Util.TestBaseDell;
import com.dellusa1.Util.TestData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepdefLoginPage extends TestBaseDell {
	HomePageAction homepageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();

	@Then("^Click on Signinbutton$")
	public void click_on_Signinbutton() throws Throwable {
		homepageAction.ClickonSigninbutton();
	}

	@Then("^Click signinlink$")
	public void click_signinlink() throws Throwable {
		homepageAction.Clicksigninlink();
	}

	@Then("^Enter user pass and Click signin$")
	public void Enter_user_pass_and_Click_signin() throws Throwable {
		loginPageAction.usercard(prop.getProperty("user1name"), prop.getProperty("user1pass"));
	}

	@Then("^verify user can login$")
	public void verify_user_can_login() throws Throwable {
		loginPageAction.verifyusercanlogin();
		TestData.takescreenshot(driver, "User Profile Page");

	}
}
