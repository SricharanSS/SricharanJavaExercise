package Exercise3;

class Worker extends Employee {
	public Worker() {
		d = new Date(2,1,2001);
	}
	Date d;
	static int salary = 15000;
	public int Salary() {
		return salary;
	}
}