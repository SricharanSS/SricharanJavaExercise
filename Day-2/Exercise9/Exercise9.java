package Exercise9;

public class Exercise9 extends A{
	
	public static void main(String[] args) {
		
		A obj = new A();
		
		System.out.println(obj.proVariable);
		obj.proMethod();
		
		System.out.println(obj.pubVariable);
		obj.pubMethod();
		
		System.out.println(obj.defaultVariable);
		obj.defaultMethod();
		
	}

}
