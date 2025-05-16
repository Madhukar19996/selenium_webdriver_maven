package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drpcountryele=driver.findElement(By.id("colors"));
		Select DrpColorEle = new Select(drpcountryele);
		List<WebElement>options=DrpColorEle.getOptions();
		Thread.sleep(3000);
		//3).Select option from the drop down from Index
		
		DrpColorEle.selectByVisibleText("Red");
		DrpColorEle.selectByVisibleText("Green");
		Thread.sleep(2000);
		DrpColorEle.deSelectByContainsVisibleText("Green");
		
		driver.quit();

	}

}
