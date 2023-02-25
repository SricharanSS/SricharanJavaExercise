package Exercise11;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Row Size:");
        int row = scan.nextInt();

        int Matrix[][] = new int[row][];

        int num = 1;
        for(int i=0; i<row; i++) {
            Matrix[i] = new int[i+1];
            for(int n=0; n<i+1; n++) {
                Matrix[i][n] = num++;
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        scan.close();
    }

}
