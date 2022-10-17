package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip_test_witout_using_invocationcount {

		@Test(enabled=false)
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

