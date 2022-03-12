package StepdefDell;


import com.dellusa1.PageAction.HomePageAction;
import com.dellusa1.Util.TestBaseDell;
import com.dellusa1.Util.TestData;
import com.dellusa1.Util.UtillDell;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefhomepage extends TestBaseDell {
	HomePageAction	 homepageAction= new HomePageAction ();
	
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		launchapplication(URL);
		TestData.takescreenshot(driver, "Home page");
		
	
	}
	@Then("^Enter xps in Searchfield$")
	public void enter_xps_in_Searchfield() throws Throwable {
		homepageAction.EnterxpsinSearchfield();
	}

	@Then("^click on Search link$")
	public void click_on_Search_link() throws Throwable {
		homepageAction.clickonSearchlink();
	}

	@Then("^verify search  result display$")
	public void verifysearchresultdisplay() throws Throwable {
		homepageAction.searchverifyresultdisplay();
		TestData.takescreenshot(driver, "Search Result Page");
		
		System.out.println("page has shown");
	}
	
	


}
	
	   
	
	
	

