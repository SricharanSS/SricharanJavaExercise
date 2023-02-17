package Exercise2;

public class Exercise2 {

	public static void main(String[] args) {		
		Variable obj = new Variable();
		System.out.println(obj.Byte);
		System.out.println(obj.Short);
		System.out.println(obj.Int);
		System.out.println(obj.Long);
		System.out.println(obj.Float);
		System.out.println(obj.Double);
		System.out.println(obj.Boolean);
		System.out.println(obj.Char);
		
	}
}

class Variable {
	byte Byte;
	short Short;
	int Int;
	long Long;
	float Float;
	double Double;
	boolean Boolean;
	char Char;
}