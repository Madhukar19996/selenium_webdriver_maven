package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionVsSoftAssertion {
	SoftAssert sa;
	
	//@Test()
	void Test_HardAssertion() 
	{
		System.out.println("Testing the first feature...");
		System.out.println("Testing the second feature...");
		
		Assert.assertEquals(1, 2);  //hard assertion 
		
		System.out.println("Testing the Third feature...");
		System.out.println("Testing the fourth feature...");
	}
	
	@Test()
	void Test_SoftAssertion() 
	{
		System.out.println("Testing the first feature...");
		System.out.println("Testing the second feature...");
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(1, 2);  //soft assertion 
		
		System.out.println("Testing the Third feature...");
		System.out.println("Testing the fourth feature...");
		
		sa.assertAll(); // Mandatory
	}

}
