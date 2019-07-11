package com.qa.AusPost.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.qa.AusPost.util.BrowserUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/com/qa/AusPost/config/config.properties");
			prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
					e.printStackTrace();
		}

	}

	public static void initialization(){
		String browserType;
		String url;
		String headlessMode;

		browserType = prop.getProperty("browser");
		headlessMode = prop.getProperty("headless");
		url =prop.getProperty("url");
		if (browserType.equalsIgnoreCase("chrome")||browserType.toUpperCase().contains("CHROME")){
			System.setProperty("webdriver.chrome.driver", BrowserUtil.getDriverPath(browserType));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");

			if(headlessMode.equalsIgnoreCase("yes"))
				BrowserUtil.headless(options);

			driver = new ChromeDriver(options);
		}
		else if(browserType.equalsIgnoreCase("ff")||browserType.toUpperCase().contains("FIRE")){
			System.setProperty("webdriver.gecko.driver", BrowserUtil.getDriverPath(browserType));
			FirefoxOptions options = new FirefoxOptions();

			if(headlessMode.equalsIgnoreCase("yes"))
				BrowserUtil.headless(options);

			driver = new FirefoxDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

}
