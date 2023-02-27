package Exercise5;


public class Exercise5 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Task());
		
		thread.start();
		
		thread.start();
	}

}
