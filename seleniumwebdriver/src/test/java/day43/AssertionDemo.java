package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test()
	void testTitle() 
	{
		String exp_title="opencart";
		String act_title="opencshop";
		
		/*if(exp_title.equals(act_title))
		{
		  System.out.println("Test Passed...");
		}
		else
		{
		  System.out.println("Test Failed...");
		}
		*/
		//Assert.assertEquals(exp_title, act_title);
		
		//Using Assertion along with conditional statement 
		
		if(exp_title.equals(act_title))
		{
		  System.out.println("Test Passed...");
		  Assert.assertTrue(true); //Use this Assertion along with conditional statement 
		}
		else
		{
		  System.out.println("Test Failed...");
		  Assert.assertTrue(false);
		}
	}

}
