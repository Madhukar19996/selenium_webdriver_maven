package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Wikipedia_MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		inputbox.sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> SeleniumLinks=driver.findElements(By.xpath("//*[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		System.out.println("Numbers of links:"+SeleniumLinks.size());
		
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		
		Set<String> WindowIDS=driver.getWindowHandles();
		System.out.println(WindowIDS);
		
		
		for(String winid :WindowIDS)
		{
			String title =driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
			if(title.equals("Selenium - Wikipedia") || title.equals("Selenium in biology - Wikipedia") || title.equals("Selenium dioxide - Wikipedia"))
			{	
			 driver.close();
			}

	}
		
  }		
	
}
	


