package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//get(url)-opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()- returns title of the web page 
		String titleofwebpage=driver.getTitle();
		System.out.println(titleofwebpage);//OrangeHRM
		
		//getCurrentUrl()- return URL of the webpage 
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//getPageSource()- returns source code of the page 
		//String PageSourceCode=driver.getPageSource();
		//System.out.println(PageSourceCode);
		
		//getWindowHandle() -return ID of the single Browser window
		//String windowId=driver.getWindowHandle();
		//System.out.println("Window ID:"+windowId); //80532259C3E9AB2A03B04C6CCE9D55D3
		                                           //51932F8AE537FCB28EE839607904450A
		//getWindowHandles()- returns ID's of the multiple browser windows
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();// This will open new browser window 
		
		Set<String >windowsIDS=driver.getWindowHandles();
		System.out.println(windowsIDS); //[604811C2AE2525AC2B6EA8FCC6570033, 75C7C18DF53A040667831FD4B4B3F71D]

		
		
		
		
		
	}

}
