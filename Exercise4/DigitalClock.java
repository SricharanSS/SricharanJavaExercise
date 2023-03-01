package Exercise4;

class DigitalClock {
	int second;
	int minute;
	int hour;
	
	DigitalClock(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	void PrintClock() {
		System.out.println(hour+":"+minute+":"+second);
	}
	
	synchronized public void Second() {
		
		if(second < 59) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			second++;
			notifyAll();
		}
		else {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		PrintClock();
	}
	
	synchronized public void Minute() {
		
		if(minute == 59) {
			minute = 0;
		}
		else if(second == 59 && minute < 59) {
			second = 0;
			minute++;
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notifyAll();
	}
	
	synchronized public void Hour() {
		
		if(hour == 23) {
			hour = 0;
		}
		else if(minute == 59 && hour < 23) {
			minute = 0;
			hour++;
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notifyAll();
	}
}