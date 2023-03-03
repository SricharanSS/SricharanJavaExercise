package StategyPattern;

class DecendingSort implements SortStrategy {
	@Override
	public void sort(int Arr[]) {
		for(int i=0; i<Arr.length-1; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				if(Arr[i] < Arr[j]) {
					int temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
	}
}
