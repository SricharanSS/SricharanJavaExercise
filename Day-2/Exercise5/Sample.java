package Exercise5;

class Sample {
	static Count c = new Count();
	public Sample() {
		c.Increment();
	}
	
	static public void ObjCreated() {
		System.out.println("Total Objects created : "+ c.returnCount());
	}
	
}