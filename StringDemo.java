import java.lang.*;
public class StringDemo 
{
	public static void main(String []args)
	{
		String s1 = "Bangladesh";
		String s2 = "bangladesh ";
		String s3 = new String("Rashford ");    // string object
		String s4 = new String("Nigeria");
		
		s1.compareTo(s2);      					//String Method
		if(s1==s2)
		{
			System.out.println("it is eqaul");
		}
		else { System.out.println("it is not equal");}
		
		System.out.println(s1.length()); 		//String Method
		System.out.println(s1.substring(2,4));  //String Method
		System.out.println(s1.charAt(2)); 		//String Method
		
		s3.compareTo(s4); //String Method
		if(s3==s4)
		{
			System.out.println("it is equal");
		}
		else { System.out.println("it is not equal");}
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.equals(s2));  
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.concat(s4));
		System.out.println(s3);
		System.out.println(s4.concat(s4));
		
		System.out.println(s2.toUpperCase()); // it will change it to uppercase for only this one, but not permanently
		System.out.println(s2);
		System.out.println(s2.substring(1,11));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.indexOf('a')); 
		
		
	}
}

