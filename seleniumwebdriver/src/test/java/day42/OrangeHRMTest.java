package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
1) Open the Application 
2) Test logo is present 
3) Login
4) Logout
*/

public class OrangeHRMTest {
	WebDriver driver;
	@Test(priority=1)
	public void openapp() 
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=2)
	void logopresence() throws InterruptedException 
	{   Thread.sleep(3000);
		boolean logo_status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed:"+logo_status);
	}
	
	@Test(priority=3)
	void login() 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Test(priority=4)
	void logout() throws InterruptedException 
	{
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	  



     	

    

}


