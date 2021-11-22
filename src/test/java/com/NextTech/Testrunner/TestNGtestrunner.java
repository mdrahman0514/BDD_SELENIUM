package com.NextTech.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGtestrunner {

	@CucumberOptions (
			features = {"Features"},
			glue = {"com.nexttech.stepdefs"},
			tags = {"@OrangehrmAction", "@HrmActionOrange"}
			)
	
	public class TestRunner extends AbstractTestNGCucumberTests{}

}
