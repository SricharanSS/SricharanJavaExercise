package Exercise25;

protected class Base {
	String Method() {
		return "WOW";
	}
}

class Derived {
	public void useD() {
		Base z = new Base();
		System.out.println("Base says "+z.Method());
	}
}

public class Exercise25 {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.useD();
	}
}
