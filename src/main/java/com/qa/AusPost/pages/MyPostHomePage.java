package com.qa.AusPost.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.AusPost.base.TestBase;
import com.qa.AusPost.util.ElementUtil;



public class MyPostHomePage extends TestBase{


	@FindBy(how = How.XPATH, using = "//span[text()= 'Manuja']")
	WebElement _manujaMenuElement;

	@FindBy(how = How.ID, using = "mypost-logout-link-desktop")
	WebElement _logoutMenuLinkElement;

	public MyPostHomePage(){
		PageFactory.initElements(driver, this);
	}

	public void clickManujaMenuElement(){

		ElementUtil.click(_manujaMenuElement,driver);

	}

	public PersonalPage clickLogoutMenuLinkElement(){

		ElementUtil.click(_logoutMenuLinkElement,driver);
		return new PersonalPage();
	}
}
