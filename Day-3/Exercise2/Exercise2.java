package Exercise2;


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
