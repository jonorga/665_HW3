package test;

/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
*/
import email_generator.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JTest {

	@Test
	public void TestBusinessCustomer() {
		Customer testCase = new Customer();
		testCase.SetCustomerType(new BusinessEmail());
		assertEquals("To whom it may concern, we are reaching out regarding this business email.", 
			testCase.GetEmail());
	}

	/*
	@Test
	public void TestTea() {
		Customer testCase = new Customer("Green Tea", 2, 0);
		assertEquals(3.0, testCase.PlaceOrder(), 0);
	}
	
	@Test
	public void TestTooManyAddons() {
		Customer testCase = new Customer("Green Tea", 5, 2);
		assertEquals(4.5, testCase.PlaceOrder(), 0);
	}

	@Test
	public void TestBadExtrasInput() {
		Customer testCase = new Customer("Yellow Tea", -1, 2);
		assertEquals(3.0, testCase.PlaceOrder(), 0);
	}

	@Test
	public void TestBadDrinkInput() {
		Customer testCase = new Customer("Gatorade", 0, 0);
		assertEquals(0, testCase.PlaceOrder(), 0);
	}
	*/
}
