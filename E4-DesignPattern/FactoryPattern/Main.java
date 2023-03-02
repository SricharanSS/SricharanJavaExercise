package FactoryPattern;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BikeFactory factory = new BikeFactory();
		Bike bike = factory.GetBike(scan.nextLine());
		
		
		
		bike.Company();
	}
}
