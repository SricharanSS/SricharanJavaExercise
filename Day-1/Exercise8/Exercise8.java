package Exercise8;

public class Exercise8 {
	public static void main(String[] args) {
		int Arr[] = {1,2,3,4,5};
		
		System.out.println("Index of Element 4 is "+ FindPos(Arr,4));
	}
	
	static int FindPos(int Arr[], int ele) {
		int index = -1;
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i] == ele) {
				index = i;
				break;
			}
		}
		return index;

	}

}
