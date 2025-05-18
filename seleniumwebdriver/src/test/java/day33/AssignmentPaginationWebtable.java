package day33;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPaginationWebtable {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		int total_page=driver.findElements(By.xpath("//*[@class='pagination']//a")).size();
			
		for(int p=1;p<=total_page;p++)
		 {
					
			if(p>1)
			{
				WebElement total_pages=driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]//a"));
				total_pages.click();
				Thread.sleep(3000);
			}
			
            //reading data from the page
			
			int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			System.out.println("Name"+" === "+"Price");
			
            for(int r=1;r<=noOfRows;r++)
				
			{   
            	String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
            	String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
            	driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input")).click();
				System.out.println(name+" === "+price);
				
			}
			
			
		
	   }
		
		driver.quit();

     }
 }