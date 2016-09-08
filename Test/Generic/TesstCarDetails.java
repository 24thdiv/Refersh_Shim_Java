package Generic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesstCarDetails {

	CarDetails car;
	
	
	@Before
	public void setUp() throws Exception {
	
		car = new CarDetails();
	
	}

	@Test
	public void testCase1() {
		
		int c=1;
		assertEquals(true, car.genericdata(c));
	}
	
	@Test
	public void testCase2() {
		
		int c=3;
		assertEquals(false, car.genericdata(c));
	}
	
	@Test
	public void testCase3() {
		
		int c=2;
		assertEquals(true, car.genericdata(c));
	}
	
	@Test
	public void testCase4() {
		
		
		assertEquals(false, car.genericdata(-1));
	}

}
