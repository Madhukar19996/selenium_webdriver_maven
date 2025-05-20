package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://text-compare.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Actions act= new Actions(driver);
		 
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("I learning Selenium with Java ");
		
		//CTRL+A - Select the Text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//CTRL+C -Copy the text 
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB  -Shift the next input box area 
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//CTRL+V - Paste the Text 
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		driver.quit();
		
	}

}
