package com.qa.AusPost.stepDefinitions;



import com.qa.AusPost.base.TestBase;
import com.qa.AusPost.pages.MyPostBusinessHomePage;
import com.qa.AusPost.pages.MyPostBusinessLoginPage;
import com.qa.AusPost.pages.MyPostHomePage;
import com.qa.AusPost.pages.MyPostLoginPage;
import com.qa.AusPost.pages.PersonalPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AusPostLoginStepDefinition extends TestBase {

	PersonalPage person;
	MyPostLoginPage mypostlog;
	MyPostBusinessLoginPage mypostbuslog;
	MyPostHomePage myposthm;
	MyPostBusinessHomePage mypostbushm;

	//	@BeforeMethod
	//	public void setup(){
	//System.out.println("inside before method");
	//		TestBase.initialization();
	//	}
	//
	//	@AfterMethod
	//	public void tearDown(){
	//		driver.close();
	//	}

	@Given("^user already on Personal page$")
	public void user_already_on_Personal_page(){
		TestBase.initialization();
		//	System.out.println(driver.getTitle());
		//	String title = "Personal, Business, Enterprise & Government solutions - Australia Post";
		//	Assert.assertEquals(title, driver.getTitle(),"Title is not as expected");
	}

	@When("^user click on mypost link$")
	public void user_click_on_mypost_link(){
		person = new PersonalPage();
		mypostlog = person.clickMyPostMenuLinkElement();

	}

	@Then("^user enters \"(.*)\" and \"(.*)\" in mypost home page$")
	public void user_enters_login_details(String username, String password){

		mypostlog.clickEmailAddressElement(username);
		mypostlog.clickPasswordElement(password);
	}

	@Then("^user click on MyPost login button$")
	public void user_click_on_MyPost_login_button(){
		myposthm = mypostlog.clickLoginButtonElement();
	}

	@Then("^user is on Mypost home page$")
	public void user_is_on_Mypost_home_page(){
		//	System.out.println(driver.getTitle());
		String title = "Log in - MyPost - Australia Post";
		//		Assert.assertEquals(title, driver.getTitle(),"Title is not as expected");
	}

	@Then("^user click on logout button in mypost home page$")
	public void user_click_on_MyPost_logout_button(){
		myposthm.clickManujaMenuElement();
		person = myposthm.clickLogoutMenuLinkElement();
		driver.close();
	}

	@When("^user click on mypostbusiness link$")
	public void user_click_on_mypostbusiness_link(){
		//	TestBase.initialization();
		person = new PersonalPage();
		mypostbuslog = person.clickMyPostBusinessMenuLinkElement();
	}

	@Then("^user enters \"(.*)\" and \"(.*)\" in mypostbusiness home page$")
	public void user_enters_mypostbusiness_login_details(String user, String pass){
		mypostbuslog.clickEmailAddressElement(user);
		mypostbuslog.clickPasswordElement(pass);
	}

	@Then("^user click on MyPostBusiness login button$")
	public void user_click_mypostbusiness_login_button(){
		mypostbushm = mypostbuslog.clickLoginButtonElement();
	}

	@Then("^user is on MypostBusiness home page$")
	public void user_is_on_MyPostBusiness_home_page(){
		String title = "Small Business Dashboard";
		//	Assert.assertEquals(title, driver.getTitle(),"Title is not as expected");
	}

	@Then("^user click on logout button in mypostbusiness home page$")
	public void user_click_on_mypostbusiness_logout_button(){
		mypostbushm.clickManujaMenuElement();
		person = mypostbushm.clickLogoutMenuLinkElement();
		driver.close();
	}
}
