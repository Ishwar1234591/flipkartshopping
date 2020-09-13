package bank.Method;

public class StepExecuter {

	public static void main(String[] args)
	{
		// browser launch
		Object [] input=new Object[2];
		input [0]="Chrome";
		input [1]="E:\\\\Cucumber.Flipkart\\\\Flipkart\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe";
		SeleniumOperation1.browserLaunch(input);
		
		//application launch
		Object [] input2=new Object[1];
		input2 [0]="https://www.flipkart.com/";
		SeleniumOperation1.applicationLaunch(input2);
		
		//username
		Object [] input3=new Object[2];
		input3 [0]="(//*[@type='text'])[2]";
		input3 [1]="9890719775";
		SeleniumOperation1.sendkeys(input3);
		
		//password
		Object [] input4=new Object[2];
		input4 [0]="//*[@type='password']";
		input4 [1]="indra@1234";
		SeleniumOperation1.sendkeys(input4);
		
		//click on login
		Object [] input5=new Object[1];
		input5 [0]="(//*[@type='submit'])[2]";
		SeleniumOperation1.clickonLogin(input5);
		
		//validation
		Object [] input6=new Object[2];
		input6 [0]="//*[text()='username and password is incorrect]";
		input [1]="username and password is incorect";
		SeleniumOperation1.validation(input6);
		

	}

}
