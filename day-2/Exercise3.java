package Exercise3;


class Date {
	static int Day;
	static int Month;
	static int Year;
	Date(int d,int m, int y) {
		Day = d;
		Month = m; 
		Year = y;
	}
}

abstract class Employee {
	public abstract int Salary();
}

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

public class Exercise3 {
	public static void main(String[] args) {
		Employee e = new SalesManager();
		System.out.println("Salary = "+e.Salary());
	}
}
