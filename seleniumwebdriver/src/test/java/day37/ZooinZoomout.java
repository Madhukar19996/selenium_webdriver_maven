package day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooinZoomout {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		
		//driver.manage().window().maximize();
		//Thread.sleep(4000);
		//driver.manage().window().minimize();
		//Thread.sleep(4000);
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(4000);
		
		js.executeScript("document.body.style.zoom='50%'");  // set the zoom level 50%
		Thread.sleep(4000);
		
		js.executeScript("document.body.style.zoom='80%'");  // set the zoom level 80%
		


	}

}
