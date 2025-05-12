package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1) Normal Alert with OK button 
		
		
		/*
		 driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();// opens the alert box 
		
		// Alert myalert=driver.switchTo().alert();
		 Thread.sleep(5000);
		// myalert.accept();
		 
		 driver.switchTo().alert().accept();
		 */
		
		//2) Confirmation Alert -OK and Cancellation 
		
		 //driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();// opens the alert box
		 //Thread.sleep(5000);
		 //driver.switchTo().alert().accept(); // Close alert window using OK button
		 //driver.switchTo().alert().dismiss(); // close alert window using cancel button
		
		//3) Prompt Alert - Input box
		
		 driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();// opens the alert box
		 Thread.sleep(5000);
		 Alert myalert=driver.switchTo().alert();
		 
		 System.out.println("Text message on alert:"+myalert.getText()); //I am a JS prompt
		 
		 myalert.sendKeys("Madhukar Pandey");

		 myalert.accept();
		 
		String  result =driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(result.contains("Madhukar Pandey"))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		 
		 
		 
		
		

	}

}
