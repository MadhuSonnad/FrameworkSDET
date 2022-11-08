package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNg_priority 
{
	@Test(priority=3)
	public void test1()
	{
		Reporter.log("hello",true);	
	}
	@Test(priority=1)
	public void test2()
	{
		Reporter.log("bye",true);
	}
        @Test(priority=2)
	public void test3()
	{
		Reporter.log("bye",false);		
	}	
}
}
