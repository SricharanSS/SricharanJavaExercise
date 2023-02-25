package Exercise14;

class Exam extends Student {
	protected int mark1,mark2,mark3;
	Exam(String name, int rollno, int mark1, int mark2, int mark3) {
		super(name, rollno);
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
}