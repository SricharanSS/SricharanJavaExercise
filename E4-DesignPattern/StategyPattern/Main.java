package StategyPattern;

public class Main {
	public static void main(String[] args) {
		int Arr[] = {2,4,1,3,5};
		SortStrategy obj = new DecendingSort();
		obj.sort(Arr);
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+" ");
		}
		
	}
}
