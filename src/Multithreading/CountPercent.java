package Multithreading;

import java.awt.Checkbox;
import java.util.HashMap;
import java.util.Scanner;

public class CountPercent {
	
	
	
	public static boolean checkmarks(int mar){
		
		if(mar<0 || mar>100){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid Marks");
				return false;
			}
		}
		else return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> marks = new HashMap<>();
		System.out.println("PLease enter Marks for Below subjects");
		int p=0,m=0,c=0,e=0,co=0;
		
		try{
		
			System.out.println("Marks of Physics");
			 p = in.nextInt();
			 if(!checkmarks(p)){
				 return;
			 }
		
			System.out.println("Marks of Maths");
			 m = in.nextInt();
			 if(!checkmarks(m)){
				 return;
			 }
			 
			System.out.println("Marks of Chemistry");
			 c = in.nextInt();
			 if(!checkmarks(c)){
				 return;
			 }
		
			System.out.println("Marks of English");
			 e = in.nextInt();
			 if(!checkmarks(e)){
				 return;
			 }
		
		
			System.out.println("Marks of Computer");
			 co = in.nextInt();
			 if(!checkmarks(co)){
				 return;
			 }
			 
		}
		catch(java.util.InputMismatchException ex){
			
			System.out.println("Invalid Input");
		}
		
		
		marks.put("Maths", m);
		marks.put("Physics", p);
		marks.put("Computer", co);
		marks.put("English", e);
		marks.put("Chemistry", c);
		
		PercentageThread per = new PercentageThread(marks);
		PCMThread pcm = new PCMThread(marks);
		
		Thread t1 = new Thread(per);
		Thread t2 = new Thread(pcm);
		
		t1.start();
		t2.start();
		
	}

}
