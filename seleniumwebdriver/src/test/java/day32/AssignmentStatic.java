package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentStatic {

	public static void main(String[] args) throws InterruptedException {
		
     
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement countrydrp=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select DropdownEle=new Select(countrydrp);
		
		DropdownEle.selectByVisibleText("Mexico City");
		
		Thread.sleep(2000);
		
		WebElement citydrp=driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select citydropdownEle=new Select(citydrp);
		
		citydropdownEle.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
		//1) Find total number of rows in a table 
		
		int rows=driver.findElements(By.tagName("tr")).size(); // Single table in a web page 
		System.out.println("Number of Rows in Table:"+rows); //6
		
		
		//3) Read data from price column 
		
		 for(int r=1;r<=5;r++)
		 {
			 String price=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			 System.out.println("Data of Price Column:"+price);
			 
		}
		 
		//choose the lowest price
		  driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[1]")).click();
		  
		// Fill the personal details 
		  
		  driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Madhukar Pandey");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@id='address']")).sendKeys("RADHE KRISHNA APARTMENTS, STREET NO 17, BARAULA, SECTOR 49,");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Noida");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Uttar Pradesh");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("202456");
		  Thread.sleep(1000);
		  
			WebElement carttype=driver.findElement(By.xpath("//select[@id='cardType']"));
			
			Select cardname=new Select(carttype);
			Thread.sleep(1000);
			  
			cardname.selectByVisibleText("Visa");
		  
		  
		  driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("999887675543");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Madhukar Pandey");
		  
		  driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		  
		//3) Validate title should be "BlazeDemo Confirmation"
			
			String act_title=driver.getTitle();
			
			if (act_title.equals("BlazeDemo Confirmation"))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
				
			}
		
		   //close the browser
		   driver.quit(); 
		
		
		


	}

}
