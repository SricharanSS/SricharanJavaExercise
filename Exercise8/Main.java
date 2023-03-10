package Exercise8;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        while(true) {
            count = 0;
            String str;
            while( !((str = scan.next()).isEmpty()) )  {
                count = count + str.length();
                System.out.println(count);
                count = 0;
            }
        }
    }
}