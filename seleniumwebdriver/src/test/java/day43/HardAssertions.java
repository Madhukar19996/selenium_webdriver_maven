package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test()
	void test()
	{
		//Assert.assertEquals("xyz", "xyz1"); //fail
		
		//Assert.assertEquals(123, 987);  //fail
		
		//Assert.assertEquals("xyz", 123);  //fail
		
		//Assert.assertEquals("123", 123);  //fail 
		
		//Assert.assertEquals("xyz", "xyz");  //pass 
		
		//Assert.assertNotEquals(123, 123);  //fail
		
		//Assert.assertNotEquals(123, 321);  //pass
		
		//Assert.assertTrue(true);  //pass
		
		//Assert.assertTrue(false);  //fail 
		
		//Assert.assertTrue(1==2); //fail
		
		//Assert.assertTrue(1==1); //passed
		
		//Assert.assertFalse(1==2); //passed
		//Assert.assertFalse(1==1);  //failed
		
		//Assert.fail();
	}

}
