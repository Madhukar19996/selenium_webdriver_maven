package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//constructor 
	LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}
	//Locators
	
	By username_txtbox_loc=By.xpath("//input[@placeholder='Username']");
	By pwd_txtbox_loc=By.xpath("//input[@placeholder='Password']");
	By login_Btn_loc=By.xpath("//button[@type='submit']");
	By logo_img_loc=By.xpath("//img[@alt='company-branding']");
	
	//Action methods
	
	public void setUserName(String username)
	{
		driver.findElement(username_txtbox_loc).sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(pwd_txtbox_loc).sendKeys(pwd);
	}
	
	public void setLoginClick()
	{
		driver.findElement(login_Btn_loc).click();
	}
	
	public void setLogoDisplayed()
	
	{
		
		boolean logo_status=driver.findElement(logo_img_loc).isDisplayed();
		System.out.println("Status of Logo display is:"+logo_status);
	}
	 

}
