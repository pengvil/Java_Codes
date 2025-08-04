import java.lang.*;
class Animal{ 
	private int age;
	private String race;
	private String colour;
	
	// creating constructor
	public Animal(){}
	
	public void setAge(int a){
		age = a;
	}
	public void setRace(String r){
		race = r;
	}
	public void setColour(String c){
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

class Encap_Setter_Getter{
	
	public static void main(String [] args){
		Animal dog = new Animal();
		Animal cat = new Animal();
		
		cat.setAge(1);
		cat.setRace("ASDF");
		cat.setColour("Black");
		
		System.out.println(cat.getAge() +" " + cat.getRace() + " " + cat.getColour());
		cat.sleep();
		cat.meow();
		
		dog.setAge(2);
		dog.setRace("lkjh");
		dog.setColour("White");
		
		System.out.println(dog.getAge() + " " + dog.getRace() + " " + dog.getColour());
		dog.sleep();
		dog.bark();
		
		
		
	}
}