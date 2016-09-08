package Queue;

import java.util.ArrayList;

public class Queue {

	public int queuesize;
	public ArrayList<String> queue;
	
	public Queue(int size){
		queuesize = size;
		queue = new ArrayList<>(size);
	}
	
	public boolean isEmpty(){
		return queue.size()==0;
	}
	
	public boolean isFull(){
		return queue.size()==queuesize;
	}
	
	public void insert(String val){
		
		if(!isFull()){
			queue.add(val);
		}
		else{
			System.out.println("Queue is Full");
		}
	}

	public String remove(){
		
		if(!isEmpty()){
			return queue.remove(0);
		}
		else{
			System.out.println("Queue is Empty");
			return null;
		}
	}

	
	public String first(){
		return queue.get(0);
	}
	
	public void print(){
		
		for(String i: queue){
			
			System.out.print(i+" <--");
		}
		System.out.println("Null");
	}
	
}


