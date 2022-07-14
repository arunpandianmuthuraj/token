package com.stepdefination;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Baseclass {
	
	@Before
	public void beforeScenerio() throws FileNotFoundException, IOException {
	 getDriver(getPropertyFileValue("browseType"));
	 loadUrl(getPropertyFileValue("url"));
	}

	@After
	public void afterScenerio(Scenario scenario) {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "EveryScenario");
		
		closeAllWindows();
		
	}
	
	
}
