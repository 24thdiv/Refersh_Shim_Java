package MultiThreding;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Multithreading.CountPercent;

public class TestCountPercentage {
	
	CountPercent pc;
	
	@Before
	public void setUp() throws Exception {
		pc= new CountPercent();
	
	}

	@Test
	public void testCase1() {
		
		int marks = 89;
		assertEquals(true, pc.checkmarks(marks));
		
	}

	@Test
	public void testCase2() {
		
		int marks = -12;
		assertEquals(false, pc.checkmarks(marks));
		
	}
	
	@Test
	public void testCase3() {
		
		int marks = 112;
		assertEquals(false, pc.checkmarks(marks));
		
	}
	
}
