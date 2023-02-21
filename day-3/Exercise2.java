package Exercise2;

interface CalcArea {
	void Area();
}

interface CalcVolume {
	void Volume();
}

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

class Triangle implements CalcArea {
	int a,b,c;
	public double area;
	
	Triangle(int A, int B, int C) {
		a = A;
		b = B;
		c = C;
	}
	
	public void Area() {
		int s = (a+b+c)/2;
		int t = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(t);
	}
}


class Sphere implements CalcVolume {
	int r;
	public int volume;
	
	Sphere(int num) {
		r = num;
	}
	
	public void Volume() {
		volume = ((r*r*r)*(22/7)*(4/3));
	}
}

class Cuboid implements CalcVolume {
	int a;
	public int volume;
	
	Cuboid(int num) {
		a = num;
	}
	
	public void Volume() {
		volume = a*a*a;
	}
}


public class Exercise2 {
	public static void main(String[] args) {
		Circle C = new Circle(4);
		C.Area();
		System.out.println("Area of Circle : "+C.area);
		
		Triangle T = new Triangle(3,5,4);
		T.Area();
		System.out.println("Area of Triangle : "+T.area);
		
		Sphere S = new Sphere(5);
		S.Volume();
		System.out.println("Volume of Sphere : "+S.volume);
	}

}
