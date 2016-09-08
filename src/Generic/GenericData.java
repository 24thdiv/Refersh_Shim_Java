package Generic;

public class GenericData<T> {

	T obj;
	
	public GenericData(T data){
		
		obj = data;
	}
	
	public T getData(){
		return obj;
	}
	
	public void setData(T t){
		obj = t;
	}
}
