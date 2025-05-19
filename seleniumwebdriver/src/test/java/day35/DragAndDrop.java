package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

   public class DragAndDrop {

	 public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		// Drag and Drop1
		WebElement Madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement Spain=driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(Madrid, Spain).perform();
		
		// Drag and Drop2
		WebElement Cohpenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement Denmark=driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(Cohpenhagen, Denmark).perform();
		
		driver.quit();
		
		



	}

}
