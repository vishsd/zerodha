package testngdiscussion;

import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "TestData",dataProviderClass = testngdiscussion.DataProviderClass.class)
	public void testCase (String s1, String s2) {
		
		System.out.println(s1+" "+s2);
		
	}
	
	
	// Automation focus --->
	// end to end scenario coverage
	//critical test scenario automate 
	// repetability reduce 
	
	
	// data provider don't involve in this focus thas way it is less use.
	// parameter are mostly use

}
