package Exercise6;
import java.util.*;
public class Exercise6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Arr[] = {1,2,3,4,5};
		System.out.println("Original Array Size is "+Arr.length);
		
		Arr = Resize(Arr,10);
		
		System.out.println("Changed Array Size is "+Arr.length);
		
		scan.close();
		
	}
	
	static int[] Resize(int Arr[], int N) {
		int len = Arr.length;
		int newArr[] = new int[N];
		
		for(int i=0; i<len; i++) {
			newArr[i] = Arr[i];
		}
		
		return newArr;
	}

}
