package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 {

	@Test
	public void test1()
	{
		Reporter.log("hello",true);
		
	}
	@Test
	public void test2()
	{
		Reporter.log("bye",true);
	}
	@Test
	public void test3()
	{
		Reporter.log("Hey",true);
		
}
}
