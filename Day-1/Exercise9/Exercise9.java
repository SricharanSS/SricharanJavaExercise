package Exercise9;

public class Exercise9 {
	public static void main(String[] args) {
		int Arr[] = {1,2,3,4,5};
		
		System.out.println("Before Reversing");
		for(int i=0; i<Arr.length; i++) {
			System.out.println(Arr[i]+" ");
		}
		
		Arr = ReverseArray(Arr);
		
		System.out.println("After Reversing");
		for(int i=0; i<Arr.length; i++) {
			System.out.println(Arr[i]+" ");
		}

		
	}
	
	static int[] ReverseArray(int Arr[]) {
		int NewArr[] = new int[Arr.length];
		
		int NewArrayIndex=0;
		int OldArrayIndex = Arr.length-1;
		
		while(OldArrayIndex >= 0) {
			NewArr[NewArrayIndex++] = Arr[OldArrayIndex--];
		}
		
		return NewArr;
	}
 
}
