package Multithreading;


import java.util.HashMap;

public class PercentageThread implements Runnable {

	public HashMap<String,Integer> marks = new HashMap<>();
	public double percentage;
	
	public PercentageThread(HashMap<String,Integer> mar){
		
		marks = mar;
		
	}
	
	public void run(){
		
		int total=0;
		
		for (HashMap.Entry<String, Integer> entry : marks.entrySet()) {
		    String key = entry.getKey();
		    
		    total = total + entry.getValue();
		}
		
		percentage = total/marks.size();
		
		System.out.println("Your Percentage is "+percentage);
		
	}
	
	
}

