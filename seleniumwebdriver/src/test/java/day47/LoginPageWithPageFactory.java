package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	
	WebDriver driver;
	
	//constructor 
	LoginPageWithPageFactory(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);  // This is  for page factory design pattern  
	}
	
	//Locators
	
	//@FindBy(xpath="//input[@placeholder='Username']")
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	WebElement username_txtbox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password_txtbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login_btn;
	
	@FindBy(xpath="//img[@alt='company-branding']") 
	WebElement logo_img_status;
	
	
	
	//Action methods
	
	public void setUserName(String username)
	{
		username_txtbox.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		password_txtbox.sendKeys(pwd);
	}
	
	public void setLoginClick()
	{
		login_btn.click();
	}
	
	public void setLogoDisplayed()
	
	{
		boolean logo_status=logo_img_status.isDisplayed();
		System.out.println("Status of Logo display is:"+logo_status);
	}
	 

}
