package day30;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	    driver.get("https://ui.vision/demo/webtest/frames/");
	    
	    driver.manage().window().maximize();
	    
	     // Switch into the frame1 
	     WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	     //Switching  into the frame1 
	     driver.switchTo().frame(frame1);
	    
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");
	    
	    driver.switchTo().defaultContent(); // This command switch into the main page 
	    
	    //Switch into the frame2 
	    WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	    //Switching  into the frame2 
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Cypress");
	    
        driver.switchTo().defaultContent(); //This command switch into the main page 
	    
	    //Switch into the frame3 
	    WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    //Switching  into the frame3 
	    driver.switchTo().frame(frame3);
	    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Playwright");
	    //driver.switchTo().defaultContent(); // This command switch into the main page 
	    
	    //Switch to inner frame (part of frame3)
	    //WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
	    driver.switchTo().frame(0); //switch to inner frame 
	    driver.findElement(By.cssSelector("div[id='i9'] div[class='AB7Lab Id5V1']")).click();

	}

}
