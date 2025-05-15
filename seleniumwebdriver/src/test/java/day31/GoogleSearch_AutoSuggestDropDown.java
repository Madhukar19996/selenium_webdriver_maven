package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium ide"); //Search box
		
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println("Number of items present in the list:"+list.size());
		
		for(WebElement li:list)
		{
			System.out.println(li.getText());
		}
		
		
		for(int i =0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		
			if(list.get(i).getText().equals("selenium ide"))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		/*for(WebElement li:list)
		{
			System.out.println(li.getText());
		}
		*/
		
		

	}

}
