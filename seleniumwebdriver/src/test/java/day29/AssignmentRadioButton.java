package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement radio_btn1=driver.findElement(By.xpath("//input[@value='radio1']"));
		WebElement radio_btn2=driver.findElement(By.xpath("//input[@value='radio2']"));
		
		System.out.println("=====Before Selection======");
		System.out.println("Select status of blue radio button:"+radio_btn1.isSelected());
		System.out.println("Select status of red radio button:"+radio_btn2.isSelected ());
		
		radio_btn1.click();
		
		
		System.out.println("=====After Selecting  radio button 1 button======");
		System.out.println("Select status of blue radio button:"+radio_btn1.isSelected());
		System.out.println("Select status of red radio button:"+radio_btn2.isSelected());
		
		Thread.sleep(3000);
		radio_btn2.click();
		
		System.out.println("=====After Selecting  radio button 2 button======");
		System.out.println("Select status of blue radio button:"+radio_btn1.isSelected());
		System.out.println("Select status of red radio button:"+radio_btn2.isSelected());
		
	}

}
