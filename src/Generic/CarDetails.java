package Generic;

import java.util.Scanner;

public class CarDetails {

	public static void main(String[] args){
		
		
		Scanner in = new Scanner(System.in);
		
		do{
		System.out.println("Enter Your choice");
		System.out.println("1. Which car you want to Buy");
		System.out.println("2. What is your minimum Price");
		int c = in.nextInt();
		
		genericdata(c);
		
		System.out.println("Do you want to continue: Y or N");
		
		}while(!in.next().equals("N"));
		
		
		
	}
	
	
	public static boolean genericdata(int c){
	
		if(c==1 || c==2){
			
		
			Scanner in = new Scanner(System.in);
		
		switch(c){
		
			case 1:
				 
				System.out.println("Enter Car name");
				String name;
				try
		        {
					 name = in.next();
		        }

		        catch (java.util.InputMismatchException e)
		        {
		            System.out.println("Invalid Input");
		            //
		            return false;
		        }
				
				
				GenericData<String> carname = new GenericData<String>(name);
				System.out.println("You entered "+carname.getData()+" car");
				break;
		
		
			case 2:
				
			System.out.println("Minimum price is ");
			int data;
			
			try
	        {
				 data = in.nextInt();
	        }

	        catch (java.util.InputMismatchException e)
	        {
	            System.out.println("Invalid Input");
	            //
	            return false;
	        }
			
			
			
			GenericData<Integer> price = new GenericData<Integer>(data);
			System.out.println("You entered "+price.getData()+" price");
			break;
		}
		return true;
		
		}
		else{
			
			return false;
		}
	}
	
	
}
