package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testtotal() {
		double initT = 12500;
		double pIncr = 5;
		assertEquals(53876.56, TuitionBill.totalt(initT, pIncr), 1);

	}
	
	@Test
	public void testmonthly() {
		double total = 50000;
		double APR = 5;
		double term = 20;
		
		assertEquals(565.13, TuitionBill.monthlypay(total, APR, term),1);

	}

}
