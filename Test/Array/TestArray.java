package Array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArray {

	ArrayExample example;
	
	@Before
	public void setUp() throws Exception {
	
		example = new ArrayExample();
	
	}

	@Test
	public void testCase1() {

		int noStu = 4;
		int marks[] = {34,56,87,90};
		String name[] = {"jay", "harsh", "darshil", "divya"};
		
		
		assertEquals(true, example.highest(noStu, name, marks));
		
	}


	@Test
	public void testCase2() {

		int noStu = 4;
		int marks[] = {56,87,90};
		String name[] = {"jay", "harsh", "darshil", "divya"};
		
		
		assertEquals(false, example.highest(noStu, name, marks));
		
	}

	@Test
	public void testCase3() {

		int noStu = 5;
		int marks[] = {56,87,90};
		String name[] = {"jay", "harsh", "darshil", "divya"};
		
		
		assertEquals(false, example.highest(noStu, name, marks));
		
	}
	@Test
	public void testCase4() {

		int noStu = 4;
		int marks[] = {56,87,90};
		String name[] = {"harsh", "darshil", "divya"};
		
		
		assertEquals(false, example.highest(noStu, name, marks));
		
	}
	
	
}
