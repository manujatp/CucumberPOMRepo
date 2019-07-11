package com.qa.AusPost.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.AusPost.base.TestBase;
import com.qa.AusPost.util.ElementUtil;



public class MyPostLoginPage extends TestBase{

	@FindBy(how = How.ID, using = "email-address")
	WebElement _emailAddressElement;

	@FindBy(how = How.ID, using = "password")
	WebElement _passwordElement;

	@FindBy(how = How.ID, using = "login-btn")
	WebElement _loginButtonElement;

	public MyPostLoginPage(){
		PageFactory.initElements(driver,this);
	}

	public void clickEmailAddressElement(String user){

		ElementUtil.set(_emailAddressElement,driver,user);

	}

	public void clickPasswordElement(String pwd){
		ElementUtil.set(_passwordElement,driver, pwd);

	}

	public MyPostHomePage clickLoginButtonElement(){
		ElementUtil.click(_loginButtonElement,driver);
		return new MyPostHomePage();
	}
}
