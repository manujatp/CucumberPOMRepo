package com.qa.AusPost.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.AusPost.base.TestBase;
import com.qa.AusPost.util.ElementUtil;


public class PersonalPage extends TestBase {


	@FindBy(how = How.XPATH, using = "//span[text()='Log in']")
	WebElement _loginMenuElement;

	@FindBy(how = How.XPATH, using = "//span[text()='MyPost']")
	WebElement _myPostMenuLinkElement;

	@FindBy(how = How.XPATH, using = "//span[text()='MyPost Business']")
	WebElement _myPostBusinessMenuLinkElement;

	public PersonalPage(){
		PageFactory.initElements(driver,this);
	}


	public MyPostLoginPage clickMyPostMenuLinkElement(){
		ElementUtil.click(_loginMenuElement, driver);
		ElementUtil.click(_myPostMenuLinkElement,driver);
		return new MyPostLoginPage();
	}

	public MyPostBusinessLoginPage clickMyPostBusinessMenuLinkElement(){
		ElementUtil.click(_loginMenuElement, driver);
		ElementUtil.click(_myPostBusinessMenuLinkElement,driver);
		return new MyPostBusinessLoginPage();
	}
}
