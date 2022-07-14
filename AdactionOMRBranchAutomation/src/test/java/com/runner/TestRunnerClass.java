package com.runner;



	import org.junit.AfterClass;
	import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(tags= {"@RunAll"},snippets=SnippetType.CAMELCASE,strict=false,dryRun=false,plugin= {"pretty","json:target\\cucumber.json"},monochrome=true,features ="src\\test\\resources\\Feature",glue="com.stepdefination")
	public class TestRunnerClass {
		
	@AfterClass
		public static void afterClass() {
		Reporting.generateJVMReprt(System.getProperty("user.dir")+"\\target\\cucumber.json");	


		}
	}





		