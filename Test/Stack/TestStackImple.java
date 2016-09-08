package Stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackImple {

	Stack st;
	
	@Before
	public void setUp() throws Exception {
	
		st = new Stack(4);
	}

	@Test
	public void testisEmpty() {
		assertEquals(true, st.isEmpty() );
	}

	@Test
	public void testisFull() {
		assertEquals(false, st.isFull() );
	}
	
	@Test
	public void testisFull2() {
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(5);
		assertEquals(true, st.isFull() );
	}

	
	@Test
	public void testPush() {
		int a = st.push(1);
		assertEquals(1,a);
	}

	
	@Test
	public void testPop() {
		st.push(1);
		int a= st.pop();
		assertEquals(1,a);
	}
}
