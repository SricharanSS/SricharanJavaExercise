package Exercise7;
import java.io.*;
import java.util.*;

public class Exercise7 {
	public static void main(String[] args){
		boolean loop = true;
		double numerator,denomerator;
		Scanner scan = new Scanner(System.in);
		double result;
		while(loop) {
			System.out.println("Enter Numerator and Denomerator(N,D) : ");
			String input = scan.next();
			if(input.equals("Q") || input.equals("q")) {
				System.out.println("Exited");
				System.exit(0);
			}
			String[] inputArr = input.split(",");
			
			numerator = Double.parseDouble(inputArr[0]);
			denomerator = Double.parseDouble(inputArr[1]);
			
			result = 0;
			try {
				
				if(denomerator == 0) {
					throw new ArithmeticException();
				}
				result = (double)numerator/denomerator;
				
				System.out.println("Result = "+result);
			}
			catch(ArithmeticException e) {
				System.out.println(e+" Divide By Zero Is Not supported");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
}
