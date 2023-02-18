package Exercise13;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. of Students : ");
        int NumOfStud = scan.nextInt();
        int Marks[][] = new int[NumOfStud][3];

        for(int i=0; i<NumOfStud; i++) {
            System.out.println("Enter the marks of Student "+(i+1)+" : ");
            for(int j=0; j<3; j++) {
                Marks[i][j] = scan.nextInt();
            }
        }

        System.out.println("Result:");
        for(int i=0; i<NumOfStud; i++) {
            System.out.println("Student "+(i+1)+" : "+(Marks[i][0]+Marks[i][1]+Marks[i][2]));
        }
        scan.close();
    }
}