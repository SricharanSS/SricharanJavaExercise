package Exercise4;

import java.io.*;

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
