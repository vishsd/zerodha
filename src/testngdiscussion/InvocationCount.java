package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	
	@Test (invocationCount = 4)    // if single text case run multiple time then use invocation - default invocation count is 1
	public void testcase() {
		
		System.out.println("test case one");
	}
	
	   @Test (enabled = false)    //if we didn't want execute this test case then use enable
      public void testcase2() {
		
		System.out.println("test case two");
	}

}
