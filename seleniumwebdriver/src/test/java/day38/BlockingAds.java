package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingAds {
	
	
	
public static void main(String[] args) {
		
	   ChromeOptions options = new ChromeOptions();
	    
	   File file = new File ("C:\\Madhukar_Pandey_I.T\\Documents\\uBlock-Origin-Lite-Chrome-Web-Store.crx");
	    
		options.addExtensions(file);
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");


  }

}
