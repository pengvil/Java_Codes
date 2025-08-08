public class StaticBlockDemo {
    public StaticBlockDemo(){
        System.out.println("Constructor Block Executed");
	}
	static {
        System.out.println("Static block 1 executed!");
    }
	static {
        System.out.println("Static block 2 executed!");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
		StaticBlockDemo a = new StaticBlockDemo();
    }
}