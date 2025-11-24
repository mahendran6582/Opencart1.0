package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	//constructor
	
public HomePage(WebDriver driver)
{
	super(driver);
}
	


	//locator
	
@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myacc;

	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	//action methods
	public void myaccountlnk()
	{
		myacc.click();
	}
	public void registerlnk()
	
	{
		register.click();
		
	}
	
}
