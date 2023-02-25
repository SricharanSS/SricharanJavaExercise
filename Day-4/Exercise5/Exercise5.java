package Exercise5;
import java.io.*;
class SampleException extends Exception {
	String msg;
	SampleException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}

class SampleClass {
	public void throwExceptionMethod() throws Exception {
		try {
			//throw new SampleException();
		}
		finally {
			System.out.print("");;
		}
	}
}

public class Exercise5 {
	public static void main(String[] args) throws Exception {
		
	}
}
