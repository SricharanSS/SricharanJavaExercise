package Exercise10;
import java.util.*;
public class Exercise10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Row Size:");
		int row = scan.nextInt();
		System.out.print("Enter Column Size:");
		int col = scan.nextInt();
		
		int Matrix[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				Matrix[i][j] = scan.nextInt();
			}
		}
		
		
		System.out.println("Matrix : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		scan.close();
	}

}
