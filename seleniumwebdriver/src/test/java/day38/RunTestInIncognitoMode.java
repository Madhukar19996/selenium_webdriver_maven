package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestInIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");  // Setting for incognito mode execution 
		
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com.gr/");
		
		
		// Validate title should be "Your Store"
		
		String act_title=driver.getTitle();
		
		if (act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
			
		}
		  driver.quit();



	}

}
