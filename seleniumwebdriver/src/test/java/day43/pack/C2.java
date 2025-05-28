package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	
	@Test()
	void xyz()
	{
		System.out.println("This is xyz from C2...");
	}
	@AfterTest()
	void At()
	{
		System.out.println("This is AfterTest method...");
	}

}
