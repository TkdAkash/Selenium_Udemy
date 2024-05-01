package dependentMethodUdemy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {
	
	@Test(priority=1)
	void apenapp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods = {"apenapp"})
	void login() {
		Assert.assertTrue(true);
//		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
	void search() {
//		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,  dependsOnMethods = {"login","search"})
	void advSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods = {"login"})
	void logout() {
		Assert.assertTrue(true);
	}

}
