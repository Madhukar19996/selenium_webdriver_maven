package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaputesScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com.gr/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 // Capture full page Screenshot
		 
		 /*
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		 File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		 sourcefile.renameTo(targetfile); // Copy source to target file 
		 */
		 
		 
		 //Capture screenshot specific area of the page 
		 
		 /*
		 WebElement swiper_slidebox=driver.findElement(By.xpath("//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']//img[@alt='iPhone 6']"));
		 
		 File sourcefile=swiper_slidebox.getScreenshotAs(OutputType.FILE);
		 File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\swipersliderbox.png");
		 sourcefile.renameTo(targetfile); // Copy source to target file 
		*/
		
		 //Capture screenshot specific element of the page 
		 WebElement logo=driver.findElement(By.xpath("//a[normalize-space()='Your Store']"));
		 
		 File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		 File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		 sourcefile.renameTo(targetfile); // Copy source to target file 
		 
		 driver.quit();
	}

}
