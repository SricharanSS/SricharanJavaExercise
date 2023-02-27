package Exercise2;
import java.util.concurrent.*;


public class Exericse2 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		
		es.execute(()-> {
			//System.out.println("Thread 1 Started.....");
			Method(1);
			//System.out.println("Thread 1 completed....");
		});
		
		es.execute(()-> {
			//System.out.println("Thread 2 Started.....");
			Method(2);
			//System.out.println("Thread 2 completed....");
		});
		
		es.execute(()-> {
			//System.out.println("Thread 3 Started.....");
			Method(3);
			//System.out.println("Thread 3 completed....");
		});
		
		es.execute(()-> {
			//System.out.println("Thread 4 Started.....");
			Method(4);
			//System.out.println("Thread 4 completed....");
		});
		
		es.shutdown();
	}
	
	public synchronized static void Method(int para) {
//		try {
//			
//			Thread.sleep(10);
//		}
//		catch(Exception e ) {
//			
//		}
		
		switch(para) {
		case 1:
			System.out.print("[ A Quick ");
			break;
		case 2:
			System.out.print("Brown Fox ");
			break;
		case 3:
			System.out.print("Jumped Over ");
			break;
		case 4:
			System.out.print("a Lazy Dog ]");
			break;
		}
		
	}
}
