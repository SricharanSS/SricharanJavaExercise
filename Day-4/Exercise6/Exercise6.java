package Exercise6;
import java.io.*;

class Base {
	public Base() {
		//throw new Exception();
	}
	
	void BaseMethod() throws Exception {
		throw new Exception();
	}
}

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


public class Exercise6 {
	public static void main(String[] args) throws Exception {
		Child C = new Child();
		
	}
}
