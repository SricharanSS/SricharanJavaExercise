package Exercise1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenAndOdd {
	static int i;
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		
		service.execute(()-> {
			PrintEven();
		});
		
		service.execute(()-> {
			PrintOdd();
			
		});
		
		service.shutdown();
		
	}
	
	synchronized static void PrintEven() {
		for(i=2; i<=100; i+=2) {
			System.out.println("Even :"+i);
		}
	}
	
	synchronized static void PrintOdd() {
		for(i=1; i<=99; i+=2) {
			System.out.println("Odd :"+i);
		}
	}
}
