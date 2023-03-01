package Exercise4;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int second = time.getSecond();
		int minute = time.getMinute();
		int hour = time.getHour();
		
		DigitalClock clock = new DigitalClock(second, minute, hour);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
			service.execute(()-> {
				while(true) {
					clock.Second();
				}
			});
			
			service.execute(()-> {
				while(true) {
					clock.Minute();
				}
			});
			
			service.execute(()-> {
				while(true) {
					clock.Hour();
				}
			});
		}
}
