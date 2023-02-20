package Exercise24;

class Quad {
	static int A,B,C;
	Quad() {
		A = 1;
		B = 1;
		C = 1;
	}
	
	Quad(int a, int b, int c) {
		A = a;
		B = b;
		C = c;
	}
	
	int ExtractorA() {
		return A;
	}
	
	int ExtractorB() {
		return B;
	}
	
	int ExtractorC() {
		return C;
	}
	
	void Modifier(int a, int b, int c) {
		A = a;
		B = b;
		C = c;
	}
	
	double Computer(int x) {
		double ans = 0;
		
		ans = ans + C + (B*x) + (A*Math.pow(x, 2));
		
		return ans;
	}
}
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
