package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//get(url)-opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();// This will open new browser window 
		
		Thread.sleep(3000);
		//driver.close(); //close single browser window wherever the driver is focus
		driver.quit();    //close all browser windows
		
	}

}
