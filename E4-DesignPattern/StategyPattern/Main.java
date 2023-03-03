package StategyPattern;

public class Main {
	public static void main(String[] args) {
		int Arr[] = {2,4,1,3,5};
		SortStrategy decend = new DecendingSort();
		SortStrategy acend = new AcendingSort();
		
		acend.sort(Arr);
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+" ");
		}
		
		decend.sort(Arr);
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+" ");
		}
	}
}
