package day33;

import java.time.Duration;

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
		
		//int total_pages=Integer.parseInt(substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		for(int p=1;p<=4;p++)
		 {
					
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//a"));
				active_page.click();
				Thread.sleep(3000);
			}
			
		
	}

}
}