package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class same_script_multiple_times
{
		@Test(invocationCount=3)
		public void test1()
		{
			Reporter.log("hello",true);
			
		}
		@Test
		public void test2()
		{
			Reporter.log("bye",true);
			
	}
	}

