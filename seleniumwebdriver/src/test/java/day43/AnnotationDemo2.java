package day43;



/*
1). Login --@BeforeClass
2). Search --@Test
3). Advanced Search --@Test
4). Logout ---@AfrerClass
*/
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
public class AnnotationDemo2 {
	
	@BeforeClass()
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
	@AfterClass()
	void test_logout()
	{
		System.out.println("This is logout method ...");
	}


}
