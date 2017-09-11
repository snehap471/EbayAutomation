package org.module;

import org.constant.ApplicationConstant;
import org.report.Log;

public class LoginModule {

	public static void loginTOEbay(String username, String password){
		Log.info("Login into " + ApplicationConstant.projectName + " with " + username +  " and " + password);
	}
	
}
