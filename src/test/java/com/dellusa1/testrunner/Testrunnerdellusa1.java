package com.dellusa1.testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.dellusa1.Util.TestBaseDell;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Featuredellusa" }, plugin = {
		"json:target/cucumber.json" }, glue = "StepdefDell",

		tags = { "@test" })
public class Testrunnerdellusa1 extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void launchapplication() {

		TestBaseDell lunch = new TestBaseDell();
		lunch.initz();

	}

	@AfterTest
	public void CloseApplication() {
		TestBaseDell closee = new TestBaseDell();
		closee.driver.quit();

	}

}
