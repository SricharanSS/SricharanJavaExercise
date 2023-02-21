package Exercise7;

class Singlton {
	
	static int num;
	
	Singlton() {
		
	}
	
	private static Singlton S = new Singlton();
	
	public static Singlton returnObj() {
		return S;
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		Singlton s = Singlton.returnObj();
		s.num = 10;
		
		Singlton b = Singlton.returnObj();
		System.out.println(b.num);
	}
}
