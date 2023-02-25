package Exercise2;

class Square implements CalcArea {
	int a;
	public int area;
	Square(int num) {
		a = num;
	}
	
	public void Area() {
		area = a*a;
	}
}