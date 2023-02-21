package Exercise5;

class Count {
	static int count = 0;
	public void Increment() {
		count++;
	}
	
	public int returnCount() {
		return count;
	}
}

class Sample {
	static Count c = new Count();
	public Sample() {
		c.Increment();
	}
	
	static public void ObjCreated() {
		System.out.println("Total Objects created : "+ c.returnCount());
	}
	
}

public class Exercise5 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		Sample s4 = new Sample();
		
		Sample.ObjCreated();
		
	}
}
