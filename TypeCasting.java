public class TypeCasting{
	public static void main (String []args){
		// implicit type casting
		/*
		byte b1 = 127;
		short s1 = b1;
		System.out.println(b1);
		System.out.println(s1);
		*/
		/*
		short s2 = 127;
		byte b2 = s2;
		System.out.println(s2);
		System.out.println(b2);
		*/
		char c = 'a';
		short s = (short) c;
		System.out.println(c);
		System.out.println(s);
	}
}