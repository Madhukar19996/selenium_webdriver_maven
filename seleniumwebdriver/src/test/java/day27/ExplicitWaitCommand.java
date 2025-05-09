package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommand {
 
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			//Explicit wait declaration
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			//usage of explicit wait 
			WebElement textusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
			textusername.sendKeys("Admin");
			
			WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
			password.sendKeys("admin123");
			
			WebElement login=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
			login.click();
			

	}

}
