package Exercise24;


public class Exercise24 {
	public static void main(String[] args) {
		Quad q1 = new Quad();
		System.out.println(q1.ExtractorA()+" "+q1.ExtractorB()+" "+q1.ExtractorC());
		
		Quad q2 = new Quad(2, 3, 4);
		System.out.println(q1.ExtractorA()+" "+q1.ExtractorB()+" "+q1.ExtractorC());
		
		q2.Modifier(5, 6, 7);
		
		System.out.println(q2.Computer(2));
		
	}

}
