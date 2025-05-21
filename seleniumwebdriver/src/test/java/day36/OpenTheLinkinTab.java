package day36;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkinTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com.gr/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Actions act= new Actions(driver);
		 
		 WebElement MyAccountPage=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		 // CTRL+MyAccountPage
		 act.keyDown(Keys.CONTROL).click(MyAccountPage).keyUp(Keys.COMMAND).perform();
		 
		 //Switching to  MyAccountPage
		 List <String> ids= new ArrayList<String>(driver.getWindowHandles());
		 
		 
		 
		 //MyAccountPage
		  
		 driver.switchTo().window(ids.get(1)); //switch to MyAccountPage page
		 
		
		 driver.findElement(By.xpath("//a[normalize-space()='Software']")).click();
		 
		//HomePage
		 driver.switchTo().window(ids.get(0)); //switch to HomePage
		 
		 WebElement Inputbox= driver.findElement(By.name("search"));
		 
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 //JavascriptExecutor js= driver;
		 
		 js.executeScript("arguments[0].setAttribute('value','MacBook')",Inputbox);
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		 

	}

}
