package annotationUdemyClassAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	void xyz() {
		System.out.println("This is xyz from Class1");
	}
	
	@AfterTest
	void n() {
		System.out.println("This After test method in class 2 ");
	}
	
}
