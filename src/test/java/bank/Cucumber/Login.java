package bank.Cucumber;

import bank.Method.SeleniumOperation1;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	@When("^user open the \"([^\"]*)\" and exe \"([^\"]*)\"$")
	public void user_open_the_and_exe(String arg1, String arg2) throws Throwable 
	{
		Object [] input=new Object[2];
	input [0]="Chrome";
	input [1]="E:\\\\Cucumber.Flipkart\\\\Flipkart\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe";
	SeleniumOperation1.browserLaunch(input);
	
	   
	}

	@When("^user enter the url \"([^\"]*)\"$")
	public void user_enter_the_url(String arg1) throws Throwable 
	{
		Object [] input2=new Object[1];
		input2 [0]="https://www.flipkart.com/";
		SeleniumOperation1.applicationLaunch(input2);
		
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable 
	{
		Object [] input3=new Object[2];
		input3 [0]="(//*[@type='text'])[2]";
		input3 [1]="9890719775";
		SeleniumOperation1.sendkeys(input3);
	   
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable 
	{
		Object [] input4=new Object[2];
		input4 [0]="//*[@type='password']";
		input4 [1]="indra@1234";
		SeleniumOperation1.sendkeys(input4);
		
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable
	{
		Object [] input5=new Object[1];
		input5 [0]="(//*[@type='submit'])[2]";
		SeleniumOperation1.clickonLogin(input5);
	    
	}

	@Then("^user show your username and passwod is incorect$")
	public void user_show_your_username_and_passwod_is_incorect() throws Throwable
	{
		Object [] input6=new Object[2];
		input6 [0]="//*[text()='username and password is incorrect]";
		input6 [1]="username and password is incorect";
		SeleniumOperation1.validation(input6);
	}


	public static void main(String[] args)
	{
	

	}

}
