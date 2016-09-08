package Multithreading;

import java.util.HashMap;

public class PCMThread implements Runnable{

	public HashMap<String,Integer> marks = new HashMap<>();
	
	public double percentage;
	
	public PCMThread(HashMap<String,Integer> mar){
		
		marks = mar;
	}
	
	
	public void run(){
		
		int total=0;
		
		for (HashMap.Entry<String, Integer> entry : marks.entrySet()) {
		    
			String key = entry.getKey();
		    
			if(key.equals("Maths") || key.equals("Physics") || key.equals("Chemistry"))
				total = total + entry.getValue();
		}
		
		percentage = total/3;
		
		System.out.println("Your Physics Chemistry Maths Percentage is "+percentage);
	}
	
	
	
}
