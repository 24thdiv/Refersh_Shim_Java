package Queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {

	Queue qu;
	
	@Before
	public void setUp() throws Exception {
	
		qu = new Queue(4);
	}

	@Test
	public void testisEmpty() {
		
		assertEquals(true, qu.isEmpty());
		
	}
	
	@Test
	public void testisEmpty2() {
		qu.insert("Hello");
		assertEquals(false, qu.isEmpty());
		
	}
	
	@Test
	public void testisFull() {
	
		assertEquals(false, qu.isFull());
		
	}
	
	@Test
	public void testinsert() {
	
		qu.insert("Hello");
		qu.insert("World");
		assertEquals("Hello", qu.first());
	}
	
	@Test
	public void testisremove() {
		
		qu.insert("Hello");
		assertEquals("Hello", qu.remove());
		
	}

}
