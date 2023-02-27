package Exercise4;

class Clock {
	int second;
	int minute;
	int hour;
	
	private static Clock clock;
	private Clock() {
		
	}
	
	public static Clock getInstance() {
		if(clock == null) {
			clock = new Clock();
		}
		return clock;
	}
	
	public void setClock(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	private void printClock() {
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}
	
	public void Second() {
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		if(second <59) {
			second++;
		}
		else {
			second = 0;
			Minute();
			return ;
		}
		printClock();
		
	}
	
	public void Minute() {
		
		if(minute<59) {
			minute++;
		}
		else {
			minute = 0;
			Hour();
			return ;
		}
	}
	
	public void Hour() {
		
		if(hour < 23) {
			hour++;
		}
		else {
			hour = 0;
			return ;
		}
	}
	
}
