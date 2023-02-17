package Exercise7;

public class Exercise7 {
	public static void main(String[] args) {
		int Arr[] = {3,5,4,2,1};
		
		System.out.println("Ascending Order:");
		for(int i=0; i<Arr.length-1; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				if(Arr[i] > Arr[j]) {
					Arr[i] = Arr[i] + Arr[j];
					Arr[j] = Arr[i] - Arr[j];
					Arr[i] = Arr[i] - Arr[j];
				}
				
			}
		}
				
		for(int i=0; i<Arr.length; i++)  {
			System.out.println(Arr[i]+" ");
		}
		
		System.out.println("Descending Order:");
		for(int i=0; i<Arr.length-1; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				if(Arr[i] < Arr[j]) {
					Arr[i] = Arr[i] + Arr[j];
					Arr[j] = Arr[i] - Arr[j];
					Arr[i] = Arr[i] - Arr[j];
				}
				
			}
		}
				
		for(int i=0; i<Arr.length; i++)  {
			System.out.println(Arr[i]+" ");
		}

	}
}
