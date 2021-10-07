mahaboobhussain.s@vishnu.edu.in
import java.util.*;
class ArraySum
{
	
	public static void main(String[] args) 
	{
	
	int size;
		
	int []arr;
		
	Scanner sc = new Scanner(System.in);
		
	size = sc.nextInt(); // read size
		
	arr = new int[size]; // declare arr size
		
		for (int i=0;i<size ;i++ ) { // read values into array
			
		arr[i] = sc.nextInt();
		
	}
		
	
	int sum = 0;
		
		for (int i=0; i<size ;i++ ) 
		{
			
		sum += arr[i]; // sum = sum + arr[i]
		
		}
		
	System.out.print(sum);      // sum of array
		
	System.out.print(sum/size); // avg of array
	
	}

}
