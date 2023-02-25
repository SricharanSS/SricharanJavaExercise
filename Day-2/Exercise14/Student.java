package Exercise14;

class Student {
	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	private String name;
	private int rollno;
	
	public String returnName() {
		return name;
	}
	public int returnRollno() {
		return rollno;
	}
}