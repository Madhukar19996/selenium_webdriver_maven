package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBoostrapTable {

	   public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Logins Steps 
		driver.findElement(By.xpath("//input[@placeholder='使用者名稱']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='密碼']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//clicking on Admin
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		
		//Reading data from the  table 
		
		System.out.println("Username"+" === "+"UserRole ");
		
		int noofrows=driver.findElements(By.xpath("//*[@role='table']//div[@role='row']")).size();
		System.out.println(noofrows);
		
		for(int r=1;r<=noofrows-1;r++)
		{
			String Username=driver.findElement(By.xpath("//*[@role='table']//div//div["+r+"]//div//div[2]")).getText();
        	String Userrole=driver.findElement(By.xpath("//*[@role='table']//div//div["+r+"]//div//div[3]")).getText();
        	
			System.out.println(Username+" === "+Userrole);
			
		}
			
		

	}

}
