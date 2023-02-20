package Exercise20;
import java.util.*;
public class Exercise20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Row:");
		int row = scan.nextInt();
		System.out.print("Enter Column");
		int col = scan.nextInt();
		int Mat[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				Mat[i][j] = scan.nextInt();
			}
		}
		
		int Max[] = new int[row];
		for(int i=0; i<row; i++) {
			Max[i] = Mat[i][0];
			for(int j=1; j<col; j++) {
				if(Max[i] < Mat[i][j]) {
					Max[i] = Mat[i][j];
				}
			}
		}
		
		
		System.out.println("The Max Elements are...");
		for(int i=0; i<row; i++) {
			System.out.println(Max[i]);
		}
		
		scan.close();
	}
}
