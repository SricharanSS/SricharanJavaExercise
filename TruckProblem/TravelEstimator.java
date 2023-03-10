package TruckProblem;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TravelEstimator {
    Truck truck;
    static final int DAILY_HOUR_LIMIT = 8;
    Scanner scan = new Scanner(System.in);
    TravelEstimator(Truck truck) {
        this.truck = truck;
    }

    
    public LocalDateTime estimateArrival() {

    	double speed = truck.getSpeed();
        double distance = truck.getDistance();
        int startHour;
        int startMinute;
        
        double arrivalTime;
        int arrivalHour = 0;
        int arrivalMinute = 0;
        while(distance != 0) {
        	
        	int dd = truck.localDateTime.getDayOfMonth();
        	int mm = truck.localDateTime.getMonthValue();
        	int yyyy = truck.localDateTime.getYear();
        	
        	if(HolidayChecker.isHoliday(truck.localDateTime)) {
        		System.out.println("Holiday for today "+dd+","+mm+" "+yyyy);
        		truck.localDateTime = truck.localDateTime.plusDays(1);
        	}
        	dd = truck.localDateTime.getDayOfMonth();
        	mm = truck.localDateTime.getMonthValue();
        	yyyy = truck.localDateTime.getYear();
        	
        	System.out.println("Enter starting time for "+dd+","+mm+" "+yyyy+" : ");
        	String time = scan.next();
        	String times[] = time.split(":");
        	startHour = Integer.parseInt(times[0]);
        	startMinute = Integer.parseInt(times[1]);
        	int remainingTime = ( (24-startHour-1)*60 + (60-startMinute) ); 
        	int travelTime;
        	if(remainingTime >= DAILY_HOUR_LIMIT*60) {
        		travelTime = DAILY_HOUR_LIMIT*60;
        	}
        	else {
        		travelTime = remainingTime;
        	}
        	
        	if(Math.round(speed*(travelTime/60)) <= distance) {
        		distance = distance - Math.round(speed*(travelTime/60));
        	}
        	else {
        		arrivalTime = distance/Math.round(speed);
        		arrivalHour = (int)arrivalTime/60;
        		arrivalMinute = (int)arrivalTime%60;
        		distance = 0;
        	}
        	truck.localDateTime = truck.localDateTime.plusDays(1);
        }
    	
    	truck.localDateTime = truck.localDateTime.plusHours(arrivalHour);
    	truck.localDateTime = truck.localDateTime.plusMinutes(arrivalMinute);
    	

		return truck.localDateTime;   
    }
}