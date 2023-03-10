package TruckProblem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Speed : ");
        double speed = scan.nextDouble();
        
        System.out.print("Enter Distance : ");
        double distance = scan.nextDouble();
        
        truck.setSpeed(speed);
        truck.setDistance(distance);

        TravelEstimator estimator = new TravelEstimator(truck);
        estimator.estimateArrival();
    }
}