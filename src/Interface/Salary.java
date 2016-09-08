package Interface;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Select you Position for Bonus Details" );
		System.out.println("1. Senior Developer");
		System.out.println("2. Junior Developer");
		
		
		Scanner in = new Scanner(System.in);
		int c = 0;
		int sal = 0;
		try
        {
			c = in.nextInt();
        }

        catch (java.util.InputMismatchException e)
        {
            System.out.println("Invalid Input");
            //
            
        }
		
		System.out.println("Enter your salary");
		
		try
        {
			sal = in.nextInt();
        }

        catch (java.util.InputMismatchException e)
        {
            System.out.println("Invalid Input");
            //
            
        }
		
		getdata(c,sal);
			
		
	}

	
	public static boolean getdata(int c, int sal ){
		
	 if((c==1 || c==2) && sal>100)
	 {	
		switch(c){
			
		case 1:
			Payment sennior = new SeniorDeveloperPayment();
			sennior.setSalary(sal);
			sennior.paymentdetails();
			break;
		case 2:
			Payment junior = new JuniorDeveloperPayment();
			junior.setSalary(sal);
			junior.paymentdetails();
			break;
			
		default:
			System.out.println("You entered wrong details");
			break;
		}
		
		return true;
	 }	
	 else{
		 return false;
	 }
	}
	
	
}
