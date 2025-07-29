import java.lang.*; // package contains fundamental classes such as System, String and Math.

class Demo {
    boolean isJavaFun = true;
    char grade = 'A';
    float floatValue = 10.5f; // must use f to indicate float value.
    double doubleValue = 20.99;
    int intValue = 100;
    byte byteValue = 25; // stores small whole numbers between -128 to 127.
    short shortValue = 3000;
    long longValue = 100000L; // must use L to indicate long value.

    void displayValues() // Method to display values
    {
        System.out.println("Boolean Value: " + isJavaFun);
        System.out.println("Character Value: " + grade);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Long Value: " + longValue);
    }
}

public class DataTypes{
    public static void main(String[] args) {
        Demo obj = new Demo(); // Creating an object of the class
        // new keyword allocates memory for the object.
        // Demo() -> Calls the constructor to initialize the object.

        obj.displayValues(); // Calling method to print values
    }
}