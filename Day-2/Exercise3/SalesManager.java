package Exercise3;

class SalesManager extends Employee {
	public SalesManager() {
		d = new Date(2,1,2001);
	}
	Date d;
	static int salary = 20000;
	public int Salary() {
		return salary;
	}
}