package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		
		
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
		    driver.get("https://ui.vision/demo/webtest/frames/");
		    
		    driver.manage().window().maximize();
		    
		    //Switch into the frame5
		    WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		    //Switching  into the frame5
		    driver.switchTo().frame(frame5);
		    driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		    
		  //Switch to inner frame (part of frame5)
		    
		    //driver.switchTo().frame(0); //switch to inner frame
		    boolean logo_img=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		    System.out.println("Logo status is present in iframe5:"+logo_img);
		   

	}

}
