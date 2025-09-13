interface Animal {
    void makeSound();
    void eat();
}

interface Object {
    void type();
    void wheels();
}
class Cat implements Animal {
    private String name;
    public Cat(String name){
        this.name = name;
    }
     
    public void showName(){
        System.out.println("The name of the cat is" + name);
    }
    public void makeSound() {
        System.out.println("It makes Meow sound");
    }
    
    public void eat() {
        System.out.println("It Eats Fish");
    }

   
}

class Vehicle implements Object{
    private String brand;
    public Vehicle(String brand){
        this.brand = brand;
    }
    
    public void showBrand(){
        System.out.println("The name of the brand is" + brand);
    }

    public void type() {
        System.out.println("The type of the vehicle is SUV");
    }
    
    public void wheels() {
        System.out.println("It has 4 wheels");
    }

    

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat(" Tom");
        myCat.showName();
        myCat.makeSound();
        myCat.eat();
        

        Vehicle myVehicle = new Vehicle(" BMW");
        myVehicle.showBrand();
        myVehicle.type();
        myVehicle.wheels();
    
        
        Vehicle myVehicle2 = new Vehicle(" AUDI");
        myVehicle.showBrand();
        myVehicle.type();
        myVehicle.wheels();
    }
}