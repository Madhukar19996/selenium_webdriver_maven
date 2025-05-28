package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1). Login --@BeforeMethod 
 2). Search --@Test
 3). Logout --@AfterMethod
 4). Login
 5). Advanced Search 
 6). Logout 
*/

public class AnnotationsDemo {
	@BeforeMethod()
	void test_login()
	{
		System.out.println("This is login Method...");
	}
	@Test(priority=1)
	void test_search()
	{
		System.out.println("This is search method...");
	}
	@Test(priority=2)
	void test_advanced_search()
	{
		System.out.println("This is advanced search method...");
	}
	@AfterMethod()
	void test_logout()
	{
		System.out.println("This is logout method ...");
	}

}
