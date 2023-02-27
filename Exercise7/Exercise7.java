package Exercise7;

import java.util.concurrent.*;

public class Exercise7 {
	public static void main(String[] args) {
		Count obj = new Count();
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		for(int i=0; i<100; i++) {	
			service.execute(()-> {
				obj.count();
			});
		}
		
	}
}
