package Exercise3;

class SalesTeritoryManager extends Employee {
	public SalesTeritoryManager() {
		d = new Date(2,1,2001);
	}
	Date d;
	static int salary = 30000;
	public int Salary() {
		return salary;
	}
}
