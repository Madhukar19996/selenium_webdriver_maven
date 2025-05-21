package day36;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demos.nop-templates.com/");
		driver.manage().window().maximize();
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
				
		Actions act=new Actions(driver);
		
		//Control+Reglink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration page
		 ArrayList <String> ids=new ArrayList<String>(driver.getWindowHandles());
		
		//Registration
		driver.switchTo().window(ids.get(1)); // switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Madhukar");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Pandey");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Madhukar1999@gmail.com");
		
		//Home page
		driver.switchTo().window(ids.get(0)); // switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("MacBook");
		driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
		
		
	}

}



