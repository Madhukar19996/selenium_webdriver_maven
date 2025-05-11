package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement male_rdb=driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_rdb=driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println("=====Before Selection======");
		System.out.println("Select status of male radio button:"+male_rdb.isSelected());
		System.out.println("Select status of female radio button:"+female_rdb.isSelected());
		
		male_rdb.click();
		
		System.out.println("=====After Selecting male radio button======");
		System.out.println("Select status of male radio button:"+male_rdb.isSelected());
		System.out.println("Select status of female radio button:"+female_rdb.isSelected());
		
		
		
		

	}

}
