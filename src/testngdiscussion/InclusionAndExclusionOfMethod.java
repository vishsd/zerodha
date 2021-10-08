package testngdiscussion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InclusionAndExclusionOfMethod {
	
	// in that we execute particular test case instead of all  or exclude test case for that we create a XML file
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("before class");
	}

	@Test
	public void testCase1() {
		System.out.println("test case 1");
	}
	@Test
	public void testCase2() {
		System.out.println("test case 2");
	}
	@Test
	public void testCase3() {
		System.out.println("test case 3");
	}

}
