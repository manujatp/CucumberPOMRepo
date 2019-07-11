package com.qa.AusPost.util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ElementUtil {

	public static void click(WebElement el, WebDriver driver){
		wait(el,driver);
		el.click();
	}

	public static void set(WebElement el,WebDriver driver, String msg){
		wait(el,driver);
		el.click();
		el.clear();
		el.sendKeys(msg);
		el.sendKeys(Keys.TAB);
	}

	public static void wait(WebElement el, WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}

}
