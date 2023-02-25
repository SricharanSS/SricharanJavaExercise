package Exercise5;
import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int len = scan.nextInt();
		int A[] = new int[len];
		System.out.println("Enter the number...");
		for(int i=0; i<len; i++) {
			A[i] = scan.nextInt();
		}
		
		System.out.println("Average="+Average(A,len));
		scan.close();
	}
	
	static int Average(int arr[], int N) {
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum = sum+arr[i];
		}
		
		return (sum/N);
	}
}
