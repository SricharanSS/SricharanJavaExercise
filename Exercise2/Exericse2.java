package Exercise2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exericse2 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		
		es.execute(()-> {
			Method(1);
		});
		
		es.execute(()-> {
			Method(2);
		});
		
		es.execute(()-> {
			Method(3);
		});
		
		es.execute(()-> {
			Method(4);
		});
		
		es.shutdown();
	}
	
	public synchronized static void Method(int para) {
		
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
