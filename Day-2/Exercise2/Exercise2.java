package Exercise2;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a1,b1,a2,b2;
		
		System.out.print("Enter a1 : ");
		a1 = scan.nextInt();
		
		System.out.print("Enter b1 : ");
		b1 = scan.nextInt();
		
		System.out.print("Enter a2 : ");
		a2 = scan.nextInt();
		
		System.out.print("Enter b2 : ");
		b2 = scan.nextInt();
		
		ComplexNum1 c = new ComplexNum1(a1,b1);
		
		c.Add(a2, b2);
		
		c.PrintNum();
		
		scan.close();
		
	}
}
