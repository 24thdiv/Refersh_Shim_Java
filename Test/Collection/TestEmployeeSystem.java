package Collection;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeSystem {

	EmployeeSystem es;
	
	
	@Before
	public void setUp() throws Exception {
	
		 es = new EmployeeSystem();
	}

	@Test
	public void testCase1() {
		
		/*Employee e = new Employee();
		e.setId(1);
		e.setName("Divya");
		e.setSalary(100000);*/
		ArrayList<Employee> list = new ArrayList<>();
		assertEquals(true,EmployeeSystem.getdata(list, 1));
		
	}
	
	@Test
	public void testCase2() {
		
		Employee e = new Employee();
		e.setId(1);
		e.setName(null);
		e.setSalary(100000);
		ArrayList<Employee> list = new ArrayList<>();
		assertEquals(false,EmployeeSystem.getdata(list, 3));
		
		
	}

}
