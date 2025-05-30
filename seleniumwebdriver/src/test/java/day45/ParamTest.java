package day45;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver ;
	
	@BeforeClass()
	@Parameters({"browser","url"})
	void setup(String br, String url)
	{    
		
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver(); break;
		case "edge"  :driver=new EdgeDriver(); break;
		case "firefox":driver=new FirefoxDriver(); break;
		default: System.out.println("Invalid Browser"); return;
		}
		
		
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=1)
	void test_logo() throws InterruptedException
	{   Thread.sleep(3000);
		boolean logo_status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed:"+logo_status);
		Assert.assertEquals(logo_status, true);
	}
	
	@Test(priority=2)
	void test_title()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	void test_URL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterClass()
	void teardown()
	{
		driver.quit();
	}

}
