package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://localhost/login.do");
		 Pom p=new Pom(driver);
		 p.clickBtn();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 p.clickBtn();
	}
	
}
