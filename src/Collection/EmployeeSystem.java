package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem {

	
	public static void print(ArrayList<Employee> list){
		
		for(int i=0;i<list.size();i++)
			System.out.println("ID: "+list.get(i).id+" Name: "+list.get(i).name+" Salary: "+list.get(i).salary);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
		
		String ch;
		ArrayList<Employee> list = new ArrayList<>();
		do{
		
		System.out.println("Enter Your choice");
		System.out.println("1. Add employee");
		System.out.println("2. Remove employee");
		int c = in.nextInt();
		  
	
		getdata(list,c);
		
		System.out.println("Do you want to continue: Y or N");
		 ch = in.next();
		
		}while(ch.equals("Y"));
	
	}

	public static boolean getdata(ArrayList<Employee> list,int c) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		if(c==1 || c==2){
		
		switch(c){
		
		case 1:
			Employee emp = new Employee();
			System.out.println("Enter Name");
			emp.setName(in.next());
			System.out.println("Enter ID");
			emp.setId(in.nextInt());
			System.out.println("Enter salary");
			emp.setSalary(in.nextDouble());
			list.add(emp);
			print(list);
			break;
		
		case 2:
			print(list);
			System.out.println("Enter ID to remove");
			int id = in.nextInt();
			for(int i=0;i<list.size();i++){
				if(id==list.get(i).id){
					list.remove(i);
					break;
				}
			}
			print(list);
			
		break;
			
		
		}
		return true;
		
	}
	
		else return false;
		
	}

	
}
