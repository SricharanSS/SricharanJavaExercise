package TruckProblem;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.info("Getting Inputs from User - speed (double) , distance (double)");
        System.out.print("Enter Speed : ");
        double speed = scan.nextDouble();

        System.out.print("Enter Distance : ");
        double distance = scan.nextDouble();
        
        truck.setSpeed(speed);
        truck.setDistance(distance);

        TravelEstimator estimator = new TravelEstimator(truck);
        LocalDateTime arraivalDate = null;
        try {
            arraivalDate = estimator.estimateArrival();
        }
        catch(DateTimeException e) {
            System.out.println(e.getMessage());
            logger.warning(e.getMessage());
        }

        System.out.println("Estimated Arrival : ");
    	System.out.println(arraivalDate.getYear()+"-"+arraivalDate.getMonth().getValue()+"-"+arraivalDate.getDayOfMonth());
    	System.out.println(arraivalDate.getHour()+":"+arraivalDate.getMinute());

        scan.close();
    }
}