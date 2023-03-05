package TruckProblem;

import java.time.LocalDateTime;

public class Truck {
	
	Truck() {
		localDateTime = LocalDateTime.now();
	}
	
    final static int DAILY_LIMIT = 8;
    private double speed;
    private double distance;
    LocalDateTime localDateTime;

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }


    public double getSpeed() {
        return speed;
    }
    public double getDistance() {
        return distance;
    }
    
}
