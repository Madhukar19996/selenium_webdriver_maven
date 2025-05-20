package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Actions act= new Actions(driver);
		 
		 
		 //Min Slider 
		 WebElement Minislider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		 
		 
		 
		 System.out.println("Defualt Location of the Mini Slider:"+Minislider.getLocation()); //Location of the Mini Slider(x=59, y=256)
        
		 act.dragAndDropBy(Minislider, 100, 256).perform(); 		 
		 System.out.println("Location of the Mini Slider after moving:"+Minislider.getLocation()); //(158, 256)
		 
		 //Max Slider
		
		 
		 WebElement Maxslider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		 
		
		 
		 System.out.println("Defualt Location of the MaxSlider:"+Maxslider.getLocation()); //(613, 256)
         
		 Thread.sleep(4000);
		 
		 act.dragAndDropBy(Maxslider, -100, 196).perform();
		 
		System.out.println("Location of the Max Slider after moving:"+Maxslider.getLocation()); //(513, 256)
		 
		driver.quit();
		 

		 
		 
		 

	}

}
