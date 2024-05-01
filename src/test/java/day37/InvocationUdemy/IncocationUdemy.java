package day37.InvocationUdemy;

import org.testng.annotations.Test;

public class IncocationUdemy {
	
	@Test(invocationCount=10)
	void test() {
		System.out.println("Akash..............");
	}

}
