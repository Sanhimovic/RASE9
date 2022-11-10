package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	//dec
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement Button;
	
	//ini
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//uti
	public void clickBtn()
	{
		Button.click();
	}
}
