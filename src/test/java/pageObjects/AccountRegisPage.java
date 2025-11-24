package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegisPage extends BasePage{
	//construtor
	
	WebDriver driver;
	
	public AccountRegisPage(WebDriver driver)
	{
		super(driver);
	}
	


	//locator
	

@FindBy(xpath="//input[@id='input-firstname']")
WebElement fistname; 

@FindBy(xpath="//input[@id='input-lastname']")
WebElement listname; 

@FindBy(xpath="//input[@id='input-email']")
WebElement eail; 

@FindBy(xpath="//input[@id='input-password']")
WebElement passwrd; 


@FindBy(xpath="//input[@name='agree']")
WebElement toggle;

@FindBy(xpath="//button[normalize-space()='Continue']")
WebElement contue; 

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

	//action methods
	
public void setfstname (String fstname) 
{
	
	fistname.sendKeys(fstname);
}

public void setlstname (String lstname) 
{

	listname.sendKeys(lstname);
}

public void setemail (String email) 
{
eail.sendKeys(email);	
}
	
public void setpwd (String pwd) 
{
	passwrd.sendKeys(pwd);
}

public void togg () 
{
	toggle.click();
}


public void btn () 
{
	contue.click();	
	
	
	
}

public String getconfirmationMsg()
{
	
	try {
		return (msgConfirmation.getText());
	}
	catch (Exception e)
	{
		return(e.getMessage());
	}
}



}
