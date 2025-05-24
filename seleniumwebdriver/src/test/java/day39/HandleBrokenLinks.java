package day39;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 
 1) Link href="https://xyz.com"
 
 2) https://xyz.com --> server-->status code 
 
 3) status code >=400 broken link 
    status code <400 not broken link
    
 */

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		//Capture all the links from webpage 
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links:"+links.size());
		
		int noofBrokenlink=0;
		for(WebElement linkElement:links)
		{
			 String hrefvalue=linkElement.getAttribute("href");
		
		
		if(hrefvalue==null || hrefvalue.isEmpty())
		{
			System.out.println("href attribute value is null or empty.so it is not possible to check");
			continue;
		}
		
		// Hit URL to the server 
		try 
		{
		URL linkurl=new URL (hrefvalue); //converted href value from string to the url format 
		
		HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection(); // open connection to the server
		
		conn.connect(); // connect to the server and sent the request the server 
		
		if(conn.getResponseCode()>=400)
			{
			
			System.out.println("Broken Link ===>:"+hrefvalue);
			 noofBrokenlink++;
			}
		else
		   {
			System.out.println("Not a broken link===>:"+hrefvalue);
		   }
		}
		catch(Exception e)
		{
			System.out.println();
		};

	 }
		
		System.out.println("Number of broken links:"+ noofBrokenlink);//42

  }
	
	
}	
