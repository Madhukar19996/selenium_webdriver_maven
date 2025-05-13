package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();// opens all the options 
		
		//1).Select single option
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2). capture all the options and find out the size
		List<WebElement>dropdownopts=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//a//label"));
		System.out.println("Number of options:"+dropdownopts.size()); //14
		
		//3) Printing options from the drop down 
		/*
		{
			System.out.println(op.getText());
		}
		*/
		
		//4). Select multiple options 
		
		for(WebElement op:dropdownopts)
		{
			String option=op.getText();
			if(option.equals("Java") || option.equals("Python"))
			{
				op.click();
			}
		}

	}

}
