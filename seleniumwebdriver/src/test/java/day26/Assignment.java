package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get(url)-opens the url on the browser
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		
		//getTitle()- returns title of the web page
		String tiltleofwebpage=driver.getTitle();
		System.out.println(tiltleofwebpage);//Automation Testing Practice
		
		//getCurrentUrl()- return URL of the webpage
        System.out.println(driver.getCurrentUrl());// https://testautomationpractice.blogspot.com/
		
		//getPageSource()- returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() -return ID of the single Browser window
        String WindowId=driver.getWindowHandle();
        System.out.println("WindowId:"+WindowId);  //EC3C824B4E0A8E55A8F221D2DA63F109
                                                   //EFFD66F1DBE3887C1050A7E533FCF333
        
		//getWindowHandles()- returns ID's of the multiple browser windows
       driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();//This will open new browser window 
       Set <String> Windowids=driver.getWindowHandles();
       System.out.println("WindowIds:"+Windowids); //[287DBD4594CCE76F382B84E9EF182E1B, 1E6A213871727C094C4AD1657AB79B09]
		
		
		
		//isDisplayed() -we can check display status of the element
        boolean textstatus=driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
        System.out.println("Display text status:"+textstatus);
		
		
		
		//isEnabled()- we can check enable/disable status of the element/operational element
        boolean searchboxstatus=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).isEnabled();
        System.out.println("Enable Searchbox Status:"+searchboxstatus);
		
		
		//isSelected()- we can use to check the element is selected or not
        WebElement Sunday_checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		WebElement Monday_checkbox=driver.findElement(By.xpath("//label[@for='monday']"));
		WebElement Tuesday_checkbox=driver.findElement(By.xpath("//label[@for='tuesday']"));
        System.out.println("Before selection any day ");
        System.out.println("Display status of Sundaycheckbox:"+Sunday_checkbox.isSelected());//false
        System.out.println("Display status of Mondaycheckbox:"+Monday_checkbox.isSelected());//false
        System.out.println("Display status of Tuesdaycheckbox:"+Tuesday_checkbox.isSelected());//false
        
        System.out.println("After selectiing Sunday and Monday");
        Sunday_checkbox.click();
        Monday_checkbox.click();
        
        System.out.println("Before selection any day ");
        System.out.println("Display status of Sundaycheckbox:"+Sunday_checkbox.isSelected());//true
        System.out.println("Display status of Mondaycheckbox:"+Monday_checkbox.isSelected());//Expected result-->true //Actual result -->false -This is defect 
        System.out.println("Display status of Tuesdaycheckbox:"+Tuesday_checkbox.isSelected());//false
        
        
        
		
		
		//driver.close() //close single browser window wherever the driver is focus
        //driver.close();
		
        //driver.quit() //close all browser windows
        driver.quit();
	}

}
