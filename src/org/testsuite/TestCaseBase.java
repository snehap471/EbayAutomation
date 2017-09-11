package org.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.report.Log;

public class TestCaseBase {
	WebDriver driver = null;
	public void initiate(){
		//WebDriver driver = new ChromeDriver();
		Log.info("Initializing Chrome Driver");
	}
}
