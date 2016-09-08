package Array;
import java.util.Scanner;

public class ArrayExample {
	
	
	
	public boolean highest(int noStu, String name[], int marks[]){
		
		if(noStu>0 && name.length==noStu && marks.length==noStu)
		{
			for(int i=0; i<noStu; i++){
				for(int j=i+1;j<noStu;j++){
				
					if(marks[j]>marks[i]){
					
						int temp = marks[j];
						marks[j] = marks[i];
						marks[i] = temp;
					
						String tmp = name[j];
						name[j] = name[i];
						name[i]= tmp;
					}
				
				}
			
			
			}
		
		return true;
	}
	else{
			return false;
		}
		
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter number of students");
		int num  = in.nextInt();
		System.out.println(num);
		System.out.println("Please enter students name");
		String[] name = new String[num];
		int[] marks = new int[num];
		for(int i=0;i<num;i++){
			name[i] = in.next();
		}
		
		
		System.out.println("Please Enter the marks of students");
		for(int i=0;i<num;i++){
			System.out.println("Marks of "+name[i]);
			marks[i] = in.nextInt();
		}
		
		
		
	
		System.out.println("Three Students who has highest marks ");
		for(int i=0; i<3;i++){
			System.out.println(name[i]+"  "+marks[i]);
		}
		
	}

}
