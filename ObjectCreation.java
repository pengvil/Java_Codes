class Animal{ 
	private int age;
	String race;
	String colour;
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

class ObjectCreation{
	
	public static void main(String [] args){
		Animal dog = new Animal();
		Animal cat = new Animal();
		
		
		cat.age = 1;
		cat.race = "ABCD";
		cat.colour = "Ginger";
		System.out.println(cat.age +" " + cat.race + " " + cat.colour);
		cat.sleep();
		cat.meow();
		
		dog.age = 2;
		dog.race = "Whiskey";
		dog.colour = "B&W";
		System.out.println(dog.age + " " + dog.race + " " + dog.colour);
		dog.sleep();
		dog.bark();
		
		
		
	}
}