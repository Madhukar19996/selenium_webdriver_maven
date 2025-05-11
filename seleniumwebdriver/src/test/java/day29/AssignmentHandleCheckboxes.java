package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//1) Select the check box 
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		WebElement checkbox2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		
		/*
		 System.out.println("Before selection:"+checkbox1.isSelected());
		
		checkbox1.click();
		System.out.println("After selection:"+checkbox1.isSelected());
		Thread.sleep(3000);
		checkbox2.click();
		System.out.println("After selection:"+checkbox2.isSelected());
		*/
		
		//2) capturing all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//*[contains(@id,'checkBoxOption')]"));
		System.out.println("Number of checkboxes:"+checkboxes.size()); 
		
		//3) selecting all the checkboxes
		
		
		/* for(int i=0; i<checkboxes.size();i++) 
		  {
			checkboxes.get(i).click();
		  }
		*/
		 
		//4) Select last 2 check boxes
			//total number of check boxes - how many check boxes do you want to select = starting index
			// checkboxes.size() - 3 = 3 - 2 = 1 --> Starting index 
			
			/*for( int i=1; i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();
			}
			*/
			
			//5) Select first 2 check boxes
			
			/*for(int i=0; i<2;i++)
			{
			  checkboxes.get(i).click();
			}
			*/
			
		
		
			//5) select specific check boxes randomely
			for(int i=0; i<checkboxes.size();i++)
			
				if(i==0 || i==2 )
				{
					checkboxes.get(i).click();
				}
				
			
			

	}

}
