package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver =new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/"); //accepts URL only in the string format
		
	    //URL myurl=new URL("https://demo.nopcommerce.com/");
		
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/"); //accepts URL in the string format & URL object format.
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		


	}

}
