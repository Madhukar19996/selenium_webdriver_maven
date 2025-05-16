package day33;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicsPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo3x.opencartreports.com/admin/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		 WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		 
		
		username.clear();
		
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		
		password.clear();
		
		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click(); //sales main menu
		
		driver.findElement(By.linkText("Orders")).click(); // orders sub menu
		
		//Showing 1 to 20 of 25 (2 Pages)
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//repeating pages
		for(int p=1;p<=2;p++)
		 {
					
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data from the page
			
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			System.out.println("orderlist"+"\t"+"customerName"+"\t"+"status"+"\t"+"total");
			
			for(int r=1;r<=noOfRows;r++)
				
			{   String orderlist=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[4]")).getText();
				String total=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				System.out.println(orderlist+"\t"+customerName+"\t"+status+"\t"+total);
				
			}
			
		   
		   
	   }
		
       driver.quit();
    }
	
}

         
