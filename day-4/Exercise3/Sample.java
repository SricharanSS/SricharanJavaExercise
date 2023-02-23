package Exercise3;
import java.io.*;

class Sample {
	public void mth1() throws Exception {
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() throws Exception {
		try {
			throw new Exception();
			System.exit(0);
		}
		catch(Exception e ) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("Finally-mth2");
		}
	}
	public static void main(String[] args) throws Exception {
		Sample S = new Sample();
		S.mth1();
	}
}
