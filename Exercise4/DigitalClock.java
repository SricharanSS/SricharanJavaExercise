package Exercise4;
import java.util.concurrent.*;
import java.time.*;


public class DigitalClock {
	
	public static void main(String[] args) {
		LocalTime localtime = LocalTime.now();
		int second = localtime.getSecond();
		int minute = localtime.getMinute();
		int hour = localtime.getHour();
		
		Clock clock = Clock.getInstance();
		
		clock.setClock(second, minute, hour);
		
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(()-> {
			while(true) {
				clock.Second();
			}
		});
		
		
		executor.shutdown();
	}

}
