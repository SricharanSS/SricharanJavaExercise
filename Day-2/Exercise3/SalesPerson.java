package Exercise3;

class SalesPerson extends Employee{
	public SalesPerson() {
		d = new Date(2,1,2001);
	}
	Date d;
	static int salary = 10000;
	public int Salary() {
		return salary;
	}
}