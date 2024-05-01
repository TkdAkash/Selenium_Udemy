package annotationUdemy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo1_Class_Annotation {
	
	
	@BeforeClass
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
	
	@AfterClass
	void logout() {
		System.out.println("Logout...............");
	}

}
