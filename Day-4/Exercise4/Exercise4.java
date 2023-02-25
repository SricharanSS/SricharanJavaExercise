package Exercise4;

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

public class Exercise4 {
	public static void main(String[] args) throws Exception {
		try { 
			throw new SampleException("Sample Exception thrown....");
		}
		catch(SampleException e) {
			//System.out.println(e);
			System.out.println(e.getMessage());
			
		}
	}
}
