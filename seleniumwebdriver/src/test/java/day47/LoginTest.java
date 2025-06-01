package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeClass()
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
	}
	@Test()
	void test_login() throws InterruptedException
	{
		LoginPageWithPageFactory lp=new LoginPageWithPageFactory(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.setLogoDisplayed();
		lp.setLoginClick();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	
	@AfterClass() 
	void tearDown()
	{
	 driver.quit();
	}
	

}
