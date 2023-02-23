package Exercise7;
import java.io.*;
import java.util.*;
public class Exercise7 {
	public static void main(String[] args) throws Exception {
		boolean loop = true;
		int numerator,denomerator;
		Scanner scan = new Scanner(System.in);
		int result;
		while(loop) {
			System.out.println("Enter Numerator and Denomerator(N,D) : ");
			String input = scan.next();
			if(input.equals("Q") || input.equals("q")) {
				System.out.println("Exited");
				System.exit(0);
			}
			String[] inputArr = input.split(",");
			
			numerator = Integer.parseInt(inputArr[0]);
			denomerator = Integer.parseInt(inputArr[1]);
			
			result = 0;
			try {
				result = numerator/denomerator;
				
				System.out.println("Result = "+result);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
}
