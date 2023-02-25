package Exercise8;


public class Exercise8 {
	public static void main(String[] args) {
		Singlton a = Singlton.returnObj();
		a.num = 10;
		
		Singlton b = Singlton.returnObj();
		System.out.println(b.num);
		
		
	}
}
