package com.qa.AusPost.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.AusPost.base.TestBase;
import com.qa.AusPost.util.ElementUtil;



public class MyPostBusinessHomePage extends TestBase{

	@FindBy(how = How.XPATH, using = "//span[text()= 'Manuja']")
	WebElement _manujaMenuElement;

	@FindBy(how = How.XPATH, using = "//a[text()='Log out']")
	WebElement _logoutMenuLinkElement;

	public MyPostBusinessHomePage(){
		PageFactory.initElements(driver,this);
	}

	public void clickManujaMenuElement(){

		ElementUtil.click(_manujaMenuElement,driver);

	}

	public PersonalPage clickLogoutMenuLinkElement(){

		ElementUtil.click(_logoutMenuLinkElement,driver);
		return new PersonalPage();
	}

}
