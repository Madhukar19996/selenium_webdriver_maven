package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		    1) Handle country drop-down with using Select class:
            https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
			a) count total number of options
			b) print all the options 
		    c) select one option
		    */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement countrydrp=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select DropdownEle=new Select(countrydrp);
		
		//a)Count total options from the drop down
		List<WebElement>options=DropdownEle.getOptions();
		System.out.println("Number of options in a drop down:"+options.size()); //Number of options in a drop down:6
		
		
		//b) print all the options
		
		/*
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		//Using enhanced for loop 
		for(WebElement op:options)
		{
		 System.out.println(op.getText());
		}
		
		//c) select one option by  from index 
		  DropdownEle.selectByIndex(4);
		  
		  Thread.sleep(3000);
		//Now select state
		  
		 WebElement state=driver.findElement(By.id("state-list"));
		 Select statedrp=new Select(state);
		 options=statedrp.getOptions();
		 System.out.println("Number of options in a drop down:"+options.size());
		 
		for(WebElement op:options)
		{
		 System.out.println(op.getText());
		}
		 
		 statedrp.selectByVisibleText("Delhi");
		 Thread.sleep(3000);
		 driver.quit();
		
		
		
		
		
		

	}

}
