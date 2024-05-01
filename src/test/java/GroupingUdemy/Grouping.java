package GroupingUdemy;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail() {
		System.out.println("login by Email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("login by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter() {
		System.out.println("login by twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupbyemail() {
		System.out.println("signup by email");
	}
	
	@Test(priority=5,groups= {"regression"})
	void signupbyFacebook() {
		System.out.println("signup by facebook");
	}

	@Test(priority=6,groups= {"regression"})
	void signuptwitter() {
		System.out.println("signup by twitter");
	}
	
	@Test(priority=7,groups= {"sanity"})
	void paymentindollar() {
		System.out.println("this is payment in dollar");
	}
	
	@Test(priority=8,groups= {"sanity","regression"})
	void paymentinrupess() {
		System.out.println("this is payment in rupees");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentinReturnbyBank() {
		System.out.println("payment return by bank");
	}
}
