package annotationUdemy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1_Method_Annotation {
	
	@BeforeMethod
	void login() {
		System.out.println("Login..................");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("Search..............");
	}
	
	@Test(priority=2)
	void abvSearch() {
		System.out.println("Advance Search...............");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("Logout...............");
	}

}
