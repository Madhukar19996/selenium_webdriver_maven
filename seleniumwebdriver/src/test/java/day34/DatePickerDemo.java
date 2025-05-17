package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	//Selecting Future Date 
	static void SelectFutureDate(WebDriver driver, String month, String year,String date) throws InterruptedException
	{
		
	  while(true)
		{
			String Current_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String Current_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
			if(Current_Month.equals(month) && Current_Year.equals(year))
			 {
			   break;
			 }
					
			 Thread.sleep(1000);
					
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button 
					
			
					
		}
			
			List<WebElement>AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
					
			for(WebElement dt:AllDates)
			{
			 
			if(dt.getText().equals(date))
			{
				dt.click();
				System.out.println("Test case passed...");
				break;
			}
			
			}

	}
	
	//Selecting Past Date 
		static void SelectPastDate(WebDriver driver, String month, String year,String date) throws InterruptedException
		{
			
		  while(true)
			{
				String Current_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String Current_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
						
				if(Current_Month.equals(month) && Current_Year.equals(year))
				 {
				   break;
				 }
						
				 Thread.sleep(1000);
						
				
						
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous button
						
			}
				
				List<WebElement>AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
						
				for(WebElement dt:AllDates)
				{
				 
				if(dt.getText().equals(date))
				{
					dt.click();
					System.out.println("Test case passed...");
					break;
				}
				
				}

		}

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Switch the frame 
		driver.switchTo().frame(0);
		
		
		//1) Using sendkeys() method 
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15/05/2025"); //mm/dd/yyyy
		
		//2) Using date picker element 
		// Expected data
		String year="2024";
		String month="June";
		String date="19";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//SelectFutureDate(driver,month,year,date); // This method is used for selection of future date 
		SelectPastDate(driver,month,year,date);     // This method is used for selection past date 
		
	
    
		driver.quit();
 }
	
}
