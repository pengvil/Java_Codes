// Single Inheritance Program
// Animal ---> Cat
import java.lang.*;
class Animal  //parent class or super class
{
    public String name;
	protected double height; //protected attribute; So, we need to use setter & getter.
	public void setHeight(double h) //set method to set the height
	{
		this.height = h;
	}
	public double getHeight() 
	{
		return height;
	}
	void work() {
		System.out.println("Running");
	}
}

class Cat extends Animal //child class or sub-class
{
    void bark() {System.out.println("Barking");}
}

public class Single_Inheritance  // main class of this program
{
    public static void main(String[] args) 
	{
        Cat c1 = new Cat();
		
		System.out.println(c1.name = "Toffie");
		c1.setHeight(3.2);
		System.out.println(c1.getHeight());
        c1.work();  // Inherited method from Animal
        c1.bark(); // Method of Cat class
    }
}
