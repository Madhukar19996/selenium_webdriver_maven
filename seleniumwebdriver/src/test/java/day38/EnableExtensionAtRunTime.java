package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRunTime {

	public static void main(String[] args) {
		
	    ChromeOptions options = new ChromeOptions();
	    
	    File file = new File ("C:\\Users\\Madhukar Pandey\\Desktop\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
	    
		options.addExtensions(file);
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");

	}

}
