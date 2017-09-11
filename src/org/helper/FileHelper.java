package org.helper;

import java.io.FileWriter;

import org.constant.ApplicationConstant;

public class FileHelper {
	public static void writeFile(String filepath, String content){
		try{
			
			FileWriter fw = new  FileWriter(filepath);
			fw.write(content);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void appendFile(String filepath, String content){
		try{
			System.out.println(filepath);
			FileWriter fw = new  FileWriter(filepath,true);
			fw.write(content + ApplicationConstant.NEWLINE);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
