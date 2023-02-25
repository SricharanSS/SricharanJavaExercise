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
