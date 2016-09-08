package Interface;

public class JuniorDeveloperPayment implements Payment{

	int salary;
	double ac_num;
	double bonus = 7.8;
	
	@Override
	public void paymentdetails() {
		// TODO Auto-generated method stub

		System.out.println("Your salary as a Junior Developer is "+salary);
		int total = (int) ((bonus*salary/100)+salary);
		System.out.println("Your bonus is "+total+" at rate "+bonus);
		System.out.println("");

	}

	public void setSalary(int sal){
		salary = sal;
	}
	
	
}
