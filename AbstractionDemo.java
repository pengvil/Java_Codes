import java.lang.*;
// This is an Abstract Class
abstract class Shape {
    protected String name;
    // constructor
	Shape(String name) {
        this.name = name;
        System.out.println("Shape constructor called: " + name);
    }

    // abstract Method
    abstract void draw();
	
    public void info() {
        System.out.println("This is a shape named: " + name);
    }
}

// this is a concrete class
class Circle extends Shape {
    int radius;
    Circle(String name, int radius) {
        super(name); 	
        this.radius = radius;
    }
	
	public void setName(String name){
		this.name = name;
	}	
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	String getName(){
		return name;
	}
	
	int getRadius(){
		return radius;
	}

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle("Circle", 5);
        s.info();  
        s.draw();   
    }
}
