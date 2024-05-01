package annotationUdemyAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@SuppressWarnings("unused")
	@Test
	void demo() {
		
//		int x = 10;
//		int y = 10;
		
//		This wont work
//		if(x == y) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("Failed");
//		}
		
//		Assert.assertEquals(x,y);
//		Assert.assertTrue(true);
//		Assert.assertTrue(false);
		
		
		
//		syntax
//		Assert.assertEquals(actual, expected,description);
		int a = 10;
		int b = 20;
		
//		Assert.assertEquals(a>b, true,"No a is less than b");
		
		String s1 = "abc";
		String s2 = "abc1";
		
//		Assert.assertEquals(s1, s2,"String are not equal");
		
//		Assert.assertNotEquals(s1, s2);
		
		if(false) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
//			Assert.fail();
		}
		
	}
	
}
