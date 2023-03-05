package TruckProblem;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setSpeed(35.5);
        truck.setDistance(600);

        TravelEstimator estimator = new TravelEstimator(truck);
        estimator.estimateArrival();
    }
}