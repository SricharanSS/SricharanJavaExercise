package Exercise14;

class Student {
	public String name;
	public int rollno;
}

class Exam extends Student {
	public int mark1,mark2,mark3;
}

class Result extends Exam {
	int totalmark;
	
	public void calTotal() {
		totalmark = mark1+mark2+mark3;
	}
	
	public int returnTotal() {
		return totalmark;
	}
}

public class Exercise14 {
	public static void main(String[] args) {
		Result R = new Result();
		R.mark1 = 77;
		R.mark2 = 80;
		R.mark3 = 74;
		
		R.calTotal();
		
		System.out.println(R.returnTotal());
	}
}
