package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed() -we can check display status of the element 
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//logo.isDisplayed();
		// System.out.println("Display status of logo:"+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("Display status:"+status); //true
		
		//isEnabled()- we can check enable/disable status of the element/operational element 
		//boolean status=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		//System.out.println("Enable status:"+status); //true
		
		//isSelected()- we can use to check the element is selected or not 
		WebElement male_rb=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rb=driver.findElement(By.xpath("//input[@id='gender-female']"));
		male_rb.isSelected();
		female_rb.isSelected();
		System.out.println("---Before selection---");
		System.out.println("Display status of logo:"+male_rb.isSelected());//false
		System.out.println("Display status of logo:"+female_rb.isSelected());//false
		
		System.out.println("---After selection female radio button---");
		female_rb.click();// select female radio button
		System.out.println("Display status of logo:"+male_rb.isSelected());//false
		System.out.println("Display status of logo:"+female_rb.isSelected());//true
		
		System.out.println("---After selection male radio button---");
		male_rb.click();// select female radio button
		System.out.println("Display status of logo:"+male_rb.isSelected());//false
		System.out.println("Display status of logo:"+female_rb.isSelected());//true
		
		boolean newsletterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Newsletter checkbox stutas:"+newsletterstatus);//true 
		
		
		
		
		
		
		

	}

}
