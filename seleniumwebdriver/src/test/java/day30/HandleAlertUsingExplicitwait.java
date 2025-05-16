package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitwait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //Explicit wait declaration 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();// opens the alert box
		Thread.sleep(5000);
		
		 Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());// Capture alertbox using explicit wait 
		 
		 myalert.accept();
		 
		 driver.quit();

	}

}
