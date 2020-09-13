package bank.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperation1 
{
	        public  static WebDriver driver=null;
	  public static void browserLaunch(Object [] inputparameters)
	  {
		  String strbrowsername=(String) inputparameters[0];
		  String exepath=(String) inputparameters[1];
		  
		  if(strbrowsername.equalsIgnoreCase("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", exepath);
			   driver=new ChromeDriver();
			  driver.manage().window().maximize();
		  }
		  else if(strbrowsername.equalsIgnoreCase("FF"))
		  {
			  System.setProperty("webdriver.FF.driver", exepath);
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
		  }
	  }
	  
	  public static void applicationLaunch(Object [] inputparameters)
	  {
		  String strURL=(String) inputparameters[0];
		  driver.get(strURL);
	  }
	  
	  public static void sendkeys(Object [] inputparameters)
	  {
		  String xpath=(String) inputparameters[0];
		  String name=(String) inputparameters[1];
		  WebElement obj=driver.findElement(By.xpath(xpath));
		             obj.clear();
		             obj.sendKeys(name);
	  }
	  
	  public static void clickonLogin(Object [] inputparameters)
	  {
		  String xpath=(String) inputparameters[0];
		  WebElement obj1=driver.findElement(By.xpath(xpath));
		             obj1.click();
	  }
      public static void validation(Object [] inputparameters)
      {
    	  String xpath=(String) inputparameters[0];
    	  String String1=(String) inputparameters[1];
    	  WebElement web=driver.findElement(By.xpath(xpath));
    	  
    	  String String2=web.getText();
    	  
    	  try {
    	  if(String1.equalsIgnoreCase(String2))
    	  {
    		  System.out.println("Test case Pass");
    	  }
    	  else 
    	  {
    		  System.out.println("Test case Fail");
    	  }
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println(e);
    	  }
      }
	public static void main(String[] args) 
	{
	      

	}

}
