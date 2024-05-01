package annotationUdemyAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	
//	@Test
	void hard_Assertion() {
		
		System.out.println("Aaksh...........");
		System.out.println("Aaksh...........");
		System.out.println("Aaksh...........");
		System.out.println("Aaksh...........");
		
//		Assert.assertEquals(1, 1);
		Assert.assertEquals(1, 1);
//		If assert condition fails then rest of statement won't run
		System.out.println("Hard assertion");
		
	}
	
	@Test
	void soft_Assertion() {
		
		System.out.println("Aaksh...........");
		System.out.println("Aaksh...........");
		System.out.println("Aaksh...........");
		System.out.println("Aaksh...........");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
//		irrespective of assert condition all statement will run
		System.out.println("Soft assertion");
		
		sa.assertAll(); //mandatory--> to invoke soft assertion
		
	}
	
	
}
