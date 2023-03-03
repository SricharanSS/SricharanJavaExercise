package FactoryPattern;

public class BikeFactory {
	public Bike GetBike(String str) {
		if(str.equals("Hunter350")) {
			return new Hunter350();
		}
		else if(str.equals("Pulsar")) {
			return new Pulsar();
		}
		else if(str.equals("Highness")) {
			return new Highness();
		}
		else if(str.equals("Apache")) {
			return new Apache();
		}
		else {
			return null;
		}
	}
}
