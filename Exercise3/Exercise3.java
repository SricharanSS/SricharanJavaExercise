package Exercise3;
import java.util.concurrent.*;
import java.util.concurrent.*;
public class Exercise3 {
	
	public static void main(String[] args) {
		
		Inventory inventory = Inventory.getInventory();
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		
		for(int i=0; i<10; i++) {
			service.execute(()-> {
				producer.produce(inventory);
			});
			
			service.execute(()-> {
				consumer.consume(inventory);
			});
		}
	
	}
}
