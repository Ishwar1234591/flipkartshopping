package bank.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava
{

	public static void main(String[] args)
	{
	   System.setProperty("webdriver.chrome.driver", "E:\\Cucumber.Flipkart\\Flipkart\\src\\test\\resources\\DRIVER\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.flipkart.com/");
	   driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9890719775");
	   driver.findElementByXPath("//*[@type='password']").sendKeys("indra@1234");
	   driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	   
	   

	}

}
