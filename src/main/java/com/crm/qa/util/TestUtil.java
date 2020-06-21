package com.crm.qa.util;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long Page_load_Timeout =50;
	public static long Implicit_Wait = 50;


    public static void takeScreenshotAtEndOfTest() throws IOException {
    	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	String currentDir = System.getProperty("user.dir");
    	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png" ));
    }
    }