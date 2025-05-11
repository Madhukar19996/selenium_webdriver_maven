package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//1) Select the check box 
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		
		//System.out.println("Before selection:"+checkbox.isSelected());
		//checkbox.click();
		//System.out.println("After selection:"+checkbox.isSelected());
		
		//2) capturing all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkboxes:"+checkboxes.size()); //7
		
		
		//3) selecting all the checkboxes
		
		/*
		 for(int i=0; i<checkboxes.size();i++) 
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement chbox:checkboxes) 
		{
			chbox.click();
		}
		*/
		
		
		//4) Select last 3 check boxes
		//total number of check boxes - how many check boxes do you want to select = starting index
		// checkboxes.size() - 3 = 7 - 3 = 4 --> Starting index 
		
		/*for( int i=4; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		//5) Select first 3 check boxes
		/*
		for(int i=0; i<3;i++)
		{
		  checkboxes.get(i).click();
		}
		*/
		
		//Thread.sleep(3000);
		
		//6) Select/unselect check boxes 
		
		/*for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
			  chkbox.click(); //unselect
			}
			else
			{
			  chkbox.click(); //select
			}
		}
		*/
		
		/*
		Thread.sleep(3000);
			
		for(WebElement chkbox1:checkboxes)
		 
				if(chkbox1.isSelected())
				{
				  chkbox1.click(); //unselect
				}
				else
				{
				  chkbox1.click(); //select
				}
				
			*/
		
		//7) select specific check boxes randomely
		/*for(int i=0; i<checkboxes.size();i++)
		
			if(i==0 || i==2 || i==6)
			{
				checkboxes.get(i).click();
			}
			*/
		
		// select checkbox based on the value
		
		String weekname="Wednesday";
		switch(weekname)
			{
			case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
			                break;
			case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
                            break;
			case "Tuesday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
                            break;
			case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
                            break;
			case "Thursday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
                            break;
			case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
                            break;
			case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
                            break;
            default : System.out.println("Invalid week name");
					
			}
	
			
		}
	}


