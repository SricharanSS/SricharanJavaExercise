package Exercise1;

class Test {
	public static int num = 10;
}

public class Exercise1 {
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println("Before Passing....");
		System.out.println("Num = "+num);
		ChangeValue(num);
		System.out.println("After Passing...");
		System.out.println("Num = "+num);
		System.out.println();
		
		
		int Arr[] = {1,2,3,4,5};
		System.out.println("Before Passing");
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		System.out.println();
		ChangeArray(Arr);
		System.out.println("After Passing...");
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		Test test = new Test();
		System.out.println("Before Passing...");
		System.out.println("Test.num = "+test.num);
		ChangeObjValue(test);
		System.out.println("After Passing...");
		System.out.println("Test.num = "+test.num);
		
	}
	
	static void ChangeObjValue(Test t) {
		t.num += 10;
	}
	
	static void ChangeArray(int Arr[]) {
		for(int i=0; i<Arr.length; i++) {
			Arr[i] += 10;
		}
	}
	
	static void ChangeValue(int num) {
		num = num + 10;
	}

}
