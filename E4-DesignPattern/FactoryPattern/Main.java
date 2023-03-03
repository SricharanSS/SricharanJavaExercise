package FactoryPattern;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BikeFactory bikeFactory = new BikeFactory();
		Bike bike = bikeFactory.GetBike(scan.nextLine());
		
		
		bike.Company();
	}
}
