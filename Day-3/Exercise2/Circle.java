package Exercise2;

class Circle implements CalcArea {
	int r;
	public int area;
	Circle(int num) {
		r = num;
	}
	
	public void Area() {
		area = (r*r)*(22/7);
	}
	
 }