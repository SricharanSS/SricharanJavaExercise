package Exercise4;
import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a Number:");
		num = scan.nextInt();
		
		boolean flag = true;
		for(int i=2; i<num/2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("it is not Prime Number");
		}
		scan.close();
	}
}
