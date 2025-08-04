import java.lang.*;
class Animal{ 
	private int age;
	private String race;
	private String colour;
	
	// creating constructor
	public Animal(int a, String r, String c){
		age = a;
		race = r;
		colour = c;
	}
	
	public int getAge(){
		return age;
	}
	public String getRace(){
		return race;
	}
	public String getColour(){
		return colour;
	}
	
	void sleep (){	
		System.out.println("Sleeping");
	}
	void bark (){
		System.out.println("Barking");
	}
	
	void meow (){
		System.out.println("Meowing");
	}
}

class Encap_Constructor{
	
	public static void main(String [] args){
		Animal dog = new Animal(1, "BCD" , "RGB");
		Animal cat = new Animal(2, "ABS", "yellow");
		
		System.out.println(cat.getAge() +" " + cat.getRace() + " " + cat.getColour());
		cat.sleep();
		cat.meow();
		
		System.out.println(dog.getAge() + " " + dog.getRace() + " " + dog.getColour());
		dog.sleep();
		dog.bark();
		
		
		
	}
}