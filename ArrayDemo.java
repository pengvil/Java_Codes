import java.lang.*;
public class ArrayDemo
{
	public static void main(String []args)
	{
		//1st Approach
		int A[] = new int [5]; // A[0] = 0, A[1] = 0, A[2] = 0,A[3] = 0, A[4] = 0
		A[0] = 10;
		A[3] = 20; 
	    for(int i=0; i<A.length; i++)  
		{
			System.out.println("A["+i+"]: "+A[i]);	
		}
		// shortcut for loop
		/* 
		for(int value : A)  
		{
			System.out.println(value);
		} 
		*/
	
	    //2nd Approach
		int B[];	// no memory allocated yet
		int size = (A[3] / A[0]) + 2; // 2 + 2 = 4 [size]
		B = new int [size];   // new int [4] --> 0 to 3
		
		B[0] = 11;
		B[1] = 22;
		B[2] = 33;
		B[3] = 44;
		
		for(int i=0; i<B.length; i++)
		{
			System.out.println("B["+i+"] : "+B[i]);	 
		}
				
		//3rd Approach
		int C[] = new int []{1,2,3};     // C [0] = 1; C[1] = 2; C[2] = 3
		for(int i=0; i<C.length; i++)
		{
			System.out.println("C["+i+"] : "+C[i]);	
		}
		
		//4th Approach, Not reccomended and DONT USE IT
		int D[] = {1,2,3,4,5};
		for (int val : D){
			System.out.println(val);
		}
		
	}
}