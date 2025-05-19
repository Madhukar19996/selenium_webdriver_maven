package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement desktops =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act= new Actions(driver);
		//Move Hover
		//act.moveToElement(desktops).moveToElement(Mac).click().build().perform();
		
		act.moveToElement(desktops).moveToElement(Mac).click().perform();
		 

	}

}
