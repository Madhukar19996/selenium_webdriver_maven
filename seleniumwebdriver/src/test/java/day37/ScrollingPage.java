package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//1) Scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0,3000)","");
		
		//System.out.println(js.executeScript("return window.pageYOffset",""));
		
		
		//2) Scroll down page till the element is visible 
		
		/*
		  WebElement ele =driver.findElement(By.xpath("//img[@alt='India']"));    
		
		  js.executeScript("arguments[0].scrollIntoView();",ele);
				
		  System.out.println(js.executeScript("return window.pageYOffset","")); //4615.2001953125
		  
		  */
		
		//3) Scroll down page till end of the page  
		
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  System.out.println(js.executeScript("return window.pageYOffset")); //11036
		  
	
		//4) Scroll up  to initial page  
		
		  Thread.sleep(4000);
		  
		  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				
		  System.out.println(js.executeScript("return window.pageYOffset")); //0
		  


	}

}
