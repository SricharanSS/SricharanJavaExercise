package Exercise14;

class Result extends Exam {
	Result(String name, int rollno,int mark1, int mark2, int mark3) {
		super(name, rollno, mark1, mark2, mark3);
	}

	int totalmark;
	
	public int returnTotal() {
		totalmark = mark1+mark2+mark3;
		return totalmark;
	}
}