package Exercise19;
import java.util.*;
public class Exercise19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row:");
		int row = scan.nextInt();
		System.out.print("Enter column");
		int col = scan.nextInt();
		
		int Mat[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				Mat[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			int J = col-1;
			for(int j=0; j<col/2; j++) {
				int temp = Mat[i][j];
				Mat[i][j] = Mat[i][J];
				Mat[i][J] = temp;
			}
		}
		
		System.out.println("After reversing rows...");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(Mat[i][j]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
