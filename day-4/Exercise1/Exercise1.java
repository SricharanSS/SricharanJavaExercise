package Exercise1;
import java.io.*;


public class Exercise1 {
	public static void main(String[] args) throws IOException {
		Exercise1.ThrowException_Demo();
	}

	static public void ThrowException_Demo() throws IOException{
		throw new IOException();
	}
}
