package Stack;

import java.util.Scanner;

public class StackImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack(5);
		
		Scanner in = new Scanner(System.in);
		String check;
		
		do{
		System.out.println("Please enter Your choice");
		System.out.println("1. Put a Dish");
		System.out.println("2. Wash Dish");
		int c = in.nextInt();
		
		switch (c) {
		
		case 1:
			
			System.out.println("Enter Dish Number");
			int n = in.nextInt();
			if(!stack.isFull()){
				stack.push(n);
				System.out.println("Dish "+n+" has been put in Rack to Wash");
				System.out.println("Now Rack status is");
				stack.print();
			}
			else{
				System.out.println("Stack is Full");
			}
			break;

		case 2:
			
			if(!stack.isEmpty()){
			
				System.out.println("Dish "+stack.peek()+" has been washed");
				stack.pop();
				System.out.println("Remaing Dishes");
				stack.print();
			}
			else{
				System.out.println("Stack is Empty");
			}
			break;
			
		default:
			System.out.println("You enter wrong choice");
			break;
			
		}
		
		System.out.println("Do you want to Continue: Y or N");
		 check = in.next();
		}while(check.equals("Y"));
		
		
	}

}
