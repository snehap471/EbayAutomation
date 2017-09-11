package org.testsuite;


import org.module.LoginModule;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest extends TestCaseBase {
	
	@BeforeMethod
	public void initiateTestCase(){
		initiate();
	}
	
	@Test
	public void TEST01_SUCCESSFULLOGIN(){
		System.out.println("Running");
		LoginModule.loginTOEbay("testusername", "testpassword");
	}
	
	
}
