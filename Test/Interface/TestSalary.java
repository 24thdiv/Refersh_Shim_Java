package Interface;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSalary {

	Salary s;
	
	
	@Before
	public void setUp() throws Exception {
	
		s = new Salary();
	
	}

	@Test
	public void testCase1() {
		
		int c = 1;
		int sal = 10000;
		assertEquals(true, s.getdata(c, sal));
		
	}
	
	@Test
	public void testCase2() {
		
		int c = 1;
		int sal = 100;
		assertEquals(false, s.getdata(c, sal));
		
	}

	@Test
	public void testCase3() {
		
		int c = 2;
		int sal = 100;
		assertEquals(false, s.getdata(c, sal));
		
	}
	
	@Test
	public void testCase4() {
		
		int c = 2;
		int sal = 1000;
		assertEquals(true, s.getdata(c, sal));
		
	}
}
