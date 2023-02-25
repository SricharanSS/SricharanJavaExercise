package Exercise15;
import java.util.*;
public class Exercise15b {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		boolean IsArmstrong = IsItArmstrong(num);
		boolean IsPalindrome = IsItPalindrome(num);
		boolean IsPerfect = IsItPerfect(num);
		
		System.out.println("Number "+num+" is...");
		System.out.println("Armstrong Number  : "+ IsArmstrong);
		System.out.println("Perfect Number    : "+ IsPerfect);
		System.out.println("Palindrome Number : "+ IsPalindrome);
		
		scan.close();
		
	}
	
	static boolean IsItPalindrome(int num) {
		
		int temp = num;
		int NewNum = 0;
		while(temp != 0) {
			NewNum = (NewNum*10) + temp%10;
			temp = temp/10;
		}
		
		if(NewNum == num) {
			return true;
		}
		else { 
			return false;
		}
		
	}
	
	static boolean IsItArmstrong(int num) {
	
		int count = 0;
		int temp = num;
		while(temp !=0 ) {
			temp = temp/10;
			count++;
		}
		
		temp = num;
		int NewNum = 0;
		while(temp != 0) {
			NewNum = (int) ((NewNum) + Math.pow((temp%10), count));
			temp = temp/10;
		}
		
		if(NewNum == num) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	static boolean IsItPerfect(int num) {
		
		int sum = 0;
		for(int i=1; i<=num/2; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum == num) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
