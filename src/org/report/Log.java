package org.report;

import java.util.Date;

import org.constant.ApplicationConstant;
import org.helper.FileHelper;

public class Log {
	public static void info(String content){
		System.out.println(content);
		Date dt = new Date();
		FileHelper.appendFile(   ApplicationConstant.logFIle, dt.toString() + " INFO " +content);
	}
	public static void error(String content){
		System.out.println(content);	
	}
	public static void warning(String content){
		System.out.println(content);	
	}
	public static void exception(String content){
		System.out.println(content);	
	}
	public static void passstep(String content){
		System.out.println(content);	
	}
	public static void failstep(String content){
		System.out.println(content);	
	}
	public static void skipstep(String content){
		System.out.println(content);	
	}
}
