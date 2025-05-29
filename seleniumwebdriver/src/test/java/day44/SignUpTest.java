package day44;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority=1,groups={"regression"})
	void Signupbyemail()
	{
		System.out.println("This is Signup by email...");
	}
	
	@Test(priority=2,groups={"regression"})
	void Signupbyfacebook()
	{
		System.out.println("This is Signup by facebook...");
	}
	
	@Test(priority=3,groups={"regression"})
	void Signupbytwitter()
	{
		System.out.println("This is Signup by twitter...");
	}


}
