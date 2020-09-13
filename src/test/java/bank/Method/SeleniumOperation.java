package bank.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperation 
{
	            static WebDriver driver=null;
	  public static void browserLaunch(String browserproperty, String exepath)
	  {
		  String browser=browserproperty;
		  String exe=exepath;
		  
		  System.setProperty(browser, exe);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  public static void applicationLaunch(String url)
	  {
		  String strURL=url;
		  driver.get(strURL);
	  }
	  
	  public static void username(String uname)
	  {
		  String name=uname;
		  driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys(name);
	  }
    public static void password(String pname)
    {
    	String name1=pname;
    	driver.findElement(By.xpath("//*[@type='password']")).sendKeys(name1);
    }
    
    public static void clickonLogin()
    {
    	driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
    }
    
    public static void validation()
    {
    	driver.findElement(By.xpath("//*[text()='Flipkart'"));
    }
	public static void main(String[] args) 
	{
	  browserLaunch("webdriver.chrome.driver", "E:\\\\Cucumber.Flipkart\\\\Flipkart\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe");
	  applicationLaunch("https://www.flipkart.com/");
	  username("9890719775");
	  password("indra@1234");
	  clickonLogin();

	}

}
