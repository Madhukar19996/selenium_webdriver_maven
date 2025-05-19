package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']
		
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();
		
		field1.sendKeys("Selenium With Java ");
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		Thread.sleep(3000);
		 String text=field2.getDomAttribute("value");
		 System.out.println("Captured value is:"+text);
		
		if(text.equals("Selenium With Java"))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		driver.quit();

	}

}
