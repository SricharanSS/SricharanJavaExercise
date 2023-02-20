package Exercise27;

public class Exercise27 {
	public static void main(String[] args) {
		int investment = 14000;
		System.out.println("During First Year...");
		investment = investment + (investment * (40/100));
		System.out.println(investment);
		
		System.out.println("During Second Year...");
		investment = investment - 1500;
		System.out.println(investment);
		
		System.out.println("After Third Year...");
		investment = investment + (investment * (12/100));
		System.out.println(investment);
	}

}
