import java.lang.*;
class Box
{
	private double length;
	private double width;
	private double height;
	
	public void setLength(double l){
		length = l;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setHeight(double h){
		height = h;
	}
	
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}	
}

public class Array_Of_Object{	
	public static void main(String args [])
	{
		Box boxes[] = new Box[10];  // Array of objects creation, boxes[0] = NULL, boxes[1] = NULL .....
		
		// basic object creation
		Box b1 = new Box();  
		b1.setLength(1.5);
		b1.setWidth(1.2);
		b1.setHeight(1.3);
		
		Box b2 = new Box(); 
		b2.setLength(2.5);
		b2.setWidth(2.1);
		b2.setHeight(2.7);
		
		boxes[0] = b1;
		boxes[2] = b2;
		// here, we didn't set any object at index-01
		
		for(int i=0; i<boxes.length; i++) // using for loop to access all the objects
		{
			if(boxes[i] != null) 
			{
				System.out.println("------------------");
				System.out.println("Boxes["+i+"] Length: "+boxes[i].getLength());
				System.out.println("Boxes["+i+"] Width: "+boxes[i].getWidth());
				System.out.println("Boxes["+i+"] Height: "+boxes[i].getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("------------------");
				System.out.println("There is No Object in boxes[" + i + "]");
			}
		}
	}
}