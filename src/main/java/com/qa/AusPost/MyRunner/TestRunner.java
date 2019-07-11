package com.qa.AusPost.MyRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/main/java/com/qa/AusPost/Features/login.feature",
		glue = ("com.qa.AusPost.stepDefinitions"),
		tags = {"~@Ignore"},
		monochrome = true,
		plugin = {"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json"
				//				"return:target/cucumber-reports/return.txt"
		}
		//		dryRun = true
		)

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Run Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucmberFeature) {
		testNGCucumberRunner.runCucumber(cucmberFeature.getCucumberFeature());
	}

	//providing features using DataProvider
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}


	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception{
		testNGCucumberRunner.finish();
	}
}
