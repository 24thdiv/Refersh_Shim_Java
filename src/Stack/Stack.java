package Stack;

public class Stack {

	public int size;
	public int top;
	int[] stackArray;
	
	public Stack(int size){
		
		this.size = size;
		stackArray = new int[size];
		top = -1;
	}
	
	public boolean isEmpty(){
		
		if(top<0) return true;
		else return false;
		
	}
	
	public boolean isFull(){
		if(top+1>=size) return true;
		else return false;
	}
	
	public int push(int val){
		
		if(isFull()){
			System.out.println("Stack is Full");
			return -1;
		}
		else{
			
			top++;
			stackArray[top] = val;
			return val;
		}
	}

	public int pop(){
	
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			int val = stackArray[top];
			stackArray[top] = -1;
			top--;
			return val;
		}
	}

	
	public int peek(){
		
		if(top!=-1)
			return stackArray[top];
		else return -1;
	}
	
	public void print(){
		
		for(int i=top;i>=0;i--){
			
			System.out.print(stackArray[i]+" -- ");
		}
		
		System.out.println("Null");
	}
}
