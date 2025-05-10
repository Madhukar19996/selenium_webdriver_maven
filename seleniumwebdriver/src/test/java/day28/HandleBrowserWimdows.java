package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWimdows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> WindowIDS=driver.getWindowHandles();
		System.out.println(WindowIDS);
		
		//Appoach1
		/*
		List<String> windowList=new ArrayList(WindowIDS);
		String parentid=windowList.get(0);
		String childid=windowList.get(1);
		
		//switch to child window 
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		*/
		
		//Appoach2 
		for(String winid :WindowIDS)
		{
			String title =driver.switchTo().window(winid).getTitle();
			
			if(title.equals("OrangeHRM"))
			{	
			System.out.println(driver.getCurrentUrl());
			//some validation on the parent window 
			}
			else 
			{
			System.out.println(driver.getCurrentUrl());
			}
			/*if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}*/
		}

	}

}
