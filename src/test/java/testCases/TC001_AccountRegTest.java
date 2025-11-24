package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegisPage;
import pageObjects.HomePage;

public class TC001_AccountRegTest {
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException 
	{
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
		Thread.sleep(8000);
		driver.manage().window().maximize();
		
				
	}
	
	@Test
	public void testval ()
	{
		HomePage hp = new HomePage(driver);
		hp.myaccountlnk();
		hp.registerlnk();
		
		
		AccountRegisPage Ap = new AccountRegisPage(driver);
		Ap.setfstname("John2");
		Ap.setlstname("Selva2");
		Ap.setemail("mail3@gmail.com");
		Ap.setpwd("Pass12");
		Ap.togg();
		Ap.btn();
		
		String confirmmess = Ap.getconfirmationMsg();
		Assert.assertEquals(confirmmess, "Your Account Has Been Created!");
		
		
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}


}
