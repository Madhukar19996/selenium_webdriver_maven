package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://qa-practice.netlify.app/double-click");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 
			 WebElement doubleclickbutton =driver.findElement(By.xpath("//button[@id='double-click-btn']"));
			 
			 //Double click action
			 Actions act =new Actions(driver);
			 act.doubleClick(doubleclickbutton).perform();
			 Thread.sleep(3000);
			 
			//10 - validation
				String msg=driver.findElement(By.xpath("//div[@id='double-click-result']")).getText();
				
				if(msg.contains("Congrats, you double clicked!"))
				{
					System.out.println("Success !! Passed");
				}
				else
				{
					System.out.println("Failed");	
				}
			
				driver.quit();


	}

}
