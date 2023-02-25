package Exercise21;
import java.util.*;
public class Exercise21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Year:");
		int year = scan.nextInt();
		boolean IsLeap = IsLeapYear(year); 
		System.out.print("Enter Month:");
		int month = scan.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11: System.out.print("31 days");
				 break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12: System.out.print("30 days");
				 break;
		case 2: if(IsLeap) {
				System.out.print("29 days");
			}
			else {
				System.out.print("28 days");
			}
		}
		
		
	}
	
	static boolean IsLeapYear(int year) {
		boolean flag = false;
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					flag = true;
				}
				else {
					flag = false;
				}
			}
			else {
				flag = true;
			}
		}
		
		return flag;
	}
}
