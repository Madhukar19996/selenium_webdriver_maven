package day38;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

/*
Test Case
----------
1) Launch browser (Chrome)
2) Open the URL https://demo.opencart.com.gr/
3) Validate title should be "Your Store"
4) Close the browser

 */



public class HeadLessTesting {

	public static void main(String[] args) {
        
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless=new");  // Setting for headless mode execution 
		
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
