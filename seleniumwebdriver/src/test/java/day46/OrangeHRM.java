package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(day46.MyListners.class)
public class OrangeHRM {
	
	WebDriver driver;
	@BeforeClass()
	public void openapp() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		
	}
	
	
	@Test(priority=3)
	void test_logopresence()
	{  
		boolean logo_status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed:"+logo_status);
	}
	@Test(priority=4)
	void test_appurl() 
	{   
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.pHp/auth/login");
	}
	
	@Test(priority=7,dependsOnMethods= {"test_appurl"})
	void test_homepagetitle() 
	{   
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	
	
	
	@Test(priority=5)
	void test_login() 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Test(priority=6,dependsOnMethods= {"test_login"})
	void Test_logout() throws InterruptedException 
	{
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=1)
	void test_loginWithInvalid() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin121");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	
	@Test(priority=2,dependsOnMethods= {"test_loginWithInvalid"})
	void test_InvalidCredentialDisplayed() 
	{
        String expected_message="Invalid credentials";
		String actual_message =driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText();
		System.out.println(actual_message);
		Assert.assertEquals(expected_message, actual_message);
	}
	
	
	@AfterClass()
	void tearDown()
	{
		driver.quit();
	}
	  
}


