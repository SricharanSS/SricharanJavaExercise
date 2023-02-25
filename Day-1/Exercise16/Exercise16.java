package Exercise16;
import java.util.*;
public class Exercise16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int ArraySize = scan.nextInt();
		int Arr[] = new int[ArraySize];
		
		System.out.println("Enter Elements");
		for(int i=0; i<ArraySize; i++) {
			Arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the elements to be searched:");
		int ele = scan.nextInt();
		int elePos[] = new int[ArraySize];
		int count = 0;
		for(int i=0; i<ArraySize; i++) {
			if(Arr[i] == ele) {
				elePos[i] = 1;
				count++;
 			}
		}
		
		if(count == 0) {
			System.out.println("Element "+ele+" is not present.");
		}
		else {
			System.out.println("Element "+ele+" is "+count+" times in the array.");
			System.out.println("Positions are...");
			for(int i=0; i<ArraySize; i++ ) {
				if(elePos[i] == 1) {
					System.out.print(i+" ");
				}
			}
		}
		scan.close();
		
	}
	
	
}
