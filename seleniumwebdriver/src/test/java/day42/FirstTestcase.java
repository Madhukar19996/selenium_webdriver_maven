package day42;

import org.testng.annotations.Test;

/*
 1) Open the Application 
 2) Login 
 3) LogOut 
 */


public class FirstTestcase {
	
	@Test(priority=10)
	void openapp()
	{
		System.out.println("Open the application....");
	}
	
	@Test(priority=30)
	void logout()
	{
		System.out.println("logout the application....");
	}
	
	
	@Test(priority=12)
	void login()
	{
		System.out.println("Login the application....");
	}
	
	

}
