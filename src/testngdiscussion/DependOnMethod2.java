package testngdiscussion;

import org.testng.annotations.Test;

public class DependOnMethod2 {
	@Test (dependsOnMethods ="testngdiscussion.DependOnMethod.admin")  //it depend on other class method
	public void holdings() {
		System.out.println("holdings method");
	}

}
