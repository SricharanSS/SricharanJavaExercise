package Exercise3;

public class Exercise3 {
	public static void main(String[] args) {
		byte Byte = 1;
		int Int = 100;
		short Short = 10;
		long Long = 1000;
		double Double = 10.10d;
		float Float = 1.5f;
		char Char = 'C';
		
		System.out.println("Byte="+Byte);
		System.out.println("Int="+Int);
		System.out.println("Short="+Short);
		System.out.println("Long="+Long);
		System.out.println("Double="+Double);
		System.out.println("Float="+Float);
		System.out.println("Char="+Char);
		
		System.out.println("Implicit Type Casting...");
		Int = Byte;
		System.out.println(Int);
		Long = Short;
		System.out.println(Long);
		
		System.out.println("Explicit Type Casting...");
		Byte = (byte)Int;
		System.out.println(Byte);
		Short = (short)Long;
		System.out.println(Short);
		
	}
}
