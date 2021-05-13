package com.massmutualtest.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "features/Solution.feature",
		glue = {"com.massmutualtest.stepdefs","com.massmutualtest.details"},
		plugin = {"pretty","html:target/HtmlReports"},
		monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
