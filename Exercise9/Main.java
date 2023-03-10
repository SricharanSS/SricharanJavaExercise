package Exercise9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] stringArray = str.split(" ");
        
        int count = 0;
        stringArray[0].trim();
        for(int i=0; i<stringArray.length; i++) {
            if( !(stringArray[i].equals("")) ) {
               count++;
            }
        }
        System.out.println("Words : "+count);
        scan.close();
    }
}
