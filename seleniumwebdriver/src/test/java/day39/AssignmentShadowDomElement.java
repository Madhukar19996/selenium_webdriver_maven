package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentShadowDomElement {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		driver.manage().window().maximize();
		

		//This Element is inside 3 nested shadow DOM.
		//String cssSelectorForHost1 = "#shadow-root";
		//String cssSelectorForHost2 = "#inner-shadow-dom";
		//String cssSelectorForHost3 = "#nested-shadow-dom";
		//Thread.sleep(1000);
		
		//Handle shadow dom element 
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		String text=shadow2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
		//System.out.println(text);
		
		
		// Validation 
		
		if(text.equals("Multi-nested Shadow Elements"))
		{
			System.out.println("Test case passed...");
		}
		else
		{
			System.out.println("Test case failed...");
		}

		driver.quit();
	}

}
