package com.qa.AusPost.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserUtil {

	public static String getDriverPath(String browserType){

		String OS =System.getProperty("os.name");
		String driverPath = "";

		if (OS.toUpperCase().contains("WINDOWS")){
			if(browserType.equalsIgnoreCase("chrome")||browserType.toUpperCase().contains("CHROME"))
				driverPath = "./src/resources/java/driver/chromedriver.exe";
			else if (browserType.equalsIgnoreCase("ff")||browserType.toUpperCase().contains("FF"))
				driverPath = "./src/resources/java/driver/geckodriver.exe";
		}
		else if (OS.toUpperCase().contains("MAC")){	
			if(browserType.equalsIgnoreCase("chrome")||browserType.toUpperCase().contains("CHROME"))
				driverPath = "./src/resources/java/driver/chromedriver";
			else if (browserType.equalsIgnoreCase("ff")||browserType.toUpperCase().contains("FF"))
				driverPath = "./src/resources/java/driver/geckodriver";
		}
		return driverPath;
	}


	//Configures chrome to run in headless mode
	public static void headless(ChromeOptions options)
	{
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
	}
	//Configures FireFox to run in headless mode
	public static void headless(FirefoxOptions options)
	{
		FirefoxBinary firefoxBinary=new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		options.setBinary(firefoxBinary);
	}
}