package Exercise8;

public class Exercise8 {
	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("A");
		
		MyClass thread1 = new MyClass(obj);
		MyClass thread2 = new MyClass(obj);
		MyClass thread3 = new MyClass(obj);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
