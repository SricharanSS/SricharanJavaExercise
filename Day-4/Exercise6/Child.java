package Exercise6;

class Child extends Base {
	public Child() {
			try {
				BaseMethod();
			}
			catch(Exception e) {
				System.out.println("Exception Thrown.....");
			}
	}
}