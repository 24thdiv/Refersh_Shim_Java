package Queue;

public class Queuev1 {

	public int size;
	public int[] queue;
	public int front=0, rear=0,noOfItems=0;

	
	public Queuev1(int size){
		this.size = size;
		queue = new int[size];
		
	}
	
	
	public boolean isEmpty(){
		
		if(noOfItems<=0)return true;
		else return false;
		
	}
	
	public boolean isFull(){
		
		if(noOfItems<size) return false; 
		else return true;
	}
	
	public void insert(int val){
		
		if (noOfItems == queue.length) {
            System.out.println("Queue is Full");
        }
		else{
			queue[rear] = val;
			rear = (rear + 1) % queue.length;
			noOfItems++;
		}
	}

	
	public void remove(){
		
		if(!isEmpty()){
			
			int item = queue[front];
	        queue[front] = -1;
	        front = (front + 1) % queue.length;
	        noOfItems--;	
		}
		else{
			System.out.println("Queue is Empty");
		}
	}
	
	public int first(){
		
		if(noOfItems!=0)
			return queue[front];
		else return -1;
	}


	public void print(){
		
		for(int i=0;i<noOfItems;i++){
			
			if((i+front)<size){
			
				System.out.print(queue[i+front]+" <--");
			}
			else{
				int num = queue[size - (i+front)];
				System.out.print(num+" <--");
			}
		}
		System.out.println("Null");
	}
	

}

