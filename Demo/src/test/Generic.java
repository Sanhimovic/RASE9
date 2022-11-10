package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
	WebDriver driver;
	@BeforeMethod
	public void openApp() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 driver=new FirefoxDriver();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
