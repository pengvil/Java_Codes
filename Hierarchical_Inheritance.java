// Hierarchical Inheritance Program
// Shape --> Circle/Rectangle

import java.lang.*;

class Shape //Parent class
{
	protected double side;
	
	public Shape()  //without parameterized constructor 
	{
		System.out.println("E-Shape");
		
	}
	Shape(double x) //parameterized constructor 
	{
		System.out.println("P-Shape");
		this.side = x;
	}
	public void setSide(double x)
	{
		this.side = x;
	}
	public double getSide()
	{
		return side;
	}
	public double getArea()
	{
		return 0;
	}
	
	public void displayInfo(){
		System.out.println(side);
	}
}

class Circle extends Shape  //Child class 1
{
	protected double area;
	public Circle()
	{
		super();			//calling the parent non-parameterized const
		System.out.println("E-Circle");
	}
	public Circle(double x)
	{
		super(x); 			//calling the parent parameterized const
		System.out.println("P-Circle");
	}
	
	@Override
    public double getArea() // method overriding
    {
        return 3.1416 * side * side;
    }

    @Override
    public void displayInfo() // method overriding
    {
        System.out.println("Side (radius): " + side);
        System.out.println("Area: " + getArea());
    }
	
}

class Rectangle extends Shape  //Child class 2
{
	public Rectangle()
	{
		super();
		System.out.println("E-Rect");
	}
	public Rectangle(double x)
	{
		super(x); //calling the parent const
		System.out.println("P-Rectangle");
	}
	public double getArea() //method overriding
	{
		return side * side;
	}
	
}


public class Hierarchical_Inheritance 
{
  public static void main(String[] args)
  {
    Circle c2 = new Circle(10);
    System.out.println("c2 side:"+c2.getSide());
    System.out.println("c2 area:"+c2.getArea());
	c2.displayInfo();
  
	Rectangle r2 = new Rectangle();
	r2.setSide(10);
    System.out.println("r2 side:"+r2.getSide());
    System.out.println("r2 area:"+r2.getArea());
  }
}
