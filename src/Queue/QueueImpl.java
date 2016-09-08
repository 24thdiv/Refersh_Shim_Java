package Queue;

import java.util.Scanner;

public class QueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Queue queue = new Queue(5);
		
		

		Scanner in = new Scanner(System.in);
		String check;
		
		do{
		System.out.println("Please Enter Your choice");
		System.out.println("1. Add Customer to Line");
		System.out.println("2. Give Ticket to Customer");
		int c = in.nextInt();
		
		switch (c) {
		
		case 1:
			
			System.out.println("Enter Customer Name");
			String n = in.next();
			if(!queue.isFull()){
				queue.insert(n);
				System.out.println("Customer "+n+" has been added in Queue");
				System.out.println("Now Queue status is");
				queue.print();
			}
			else{
				System.out.println("Queue is Full");
			}
				
				
			break;

		case 2:
			
			
			
			if(!queue.isEmpty()){
				System.out.println("Ticket has been given to "+queue.first());
				queue.remove();
				
				System.out.println("Remaing Customers");
				queue.print();
			}
			else{
				System.out.println("Queue is empty");
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
