package day35;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class RightClickAction {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement rightclickbutton =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		 Actions act =new Actions(driver);
		 Thread.sleep(2000);
		 //Right click action
		 act.contextClick(rightclickbutton).perform();
		 
		 //click on delete
		 driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
		 
		 //close alert box 
		 Alert myalert=driver.switchTo().alert();
		 Thread.sleep(2000);
		 myalert.accept();

	}

}
