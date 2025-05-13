package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement drpcountryele=driver.findElement(By.xpath("//select[@id='country']"));
			Select DrpCountryEle = new Select(drpcountryele);
			
			//1).Select option from the drop down from VisibleText
			
			//DrpCountryEle.selectByContainsVisibleText("India");
			
			//2).Select option from the drop down from value 
			// DrpCountryEle.selectByValue("japan");
			
			//3).Select option from the drop down from Index
			//DrpCountryEle.selectByIndex(4);
			
			
			//capture the options from the drop down
			List<WebElement>options=DrpCountryEle.getOptions();
			System.out.println("Number of options in a drop down:"+options.size()); //10
			
			//print the options in a console 
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
	}

}
