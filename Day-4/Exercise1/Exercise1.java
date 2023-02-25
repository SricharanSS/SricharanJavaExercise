package Exercise1;
import java.io.*;

class SampleClass {
	public void ThrowException_Demo() throws Exception{
		throw new IOException();
	}
}

public class Exercise1 {
	public static void main(String[] args) throws Exception {
		SampleClass Sc = new SampleClass();
		
		Sc.ThrowException_Demo();
	}
}
