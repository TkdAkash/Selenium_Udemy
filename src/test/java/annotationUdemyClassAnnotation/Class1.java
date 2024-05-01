package annotationUdemyClassAnnotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void abc() {
		System.out.println("This is abc from Class1");
	}

	@BeforeTest
	void m() {
		System.out.println("This before test method in class 1 ");
	}
	
}
