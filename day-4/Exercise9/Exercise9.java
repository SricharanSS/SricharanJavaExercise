package Exercise9;
import java.util.*;

class NegativeNumberException extends Exception {
	String msg;
	NegativeNumberException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		return msg;
	}
}

class OutOfRangeException extends Exception {
	String msg;
	OutOfRangeException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}

class StudentMarks {
	int mark1,mark2,mark3;
	
	public int Average() {
		return (mark1+mark2+mark3)/3;
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		
		StudentMarks S = new StudentMarks();
		Scanner scan = new Scanner(System.in);
		String input;
		boolean loop = true;
		while(loop) {
			System.out.print("Enter the marks(mark 1 mark 2 mark 3) : ");
			input = scan.nextLine();
			try {
				String mark[] = input.split("\\s");
				S.mark1 = Integer.parseInt(mark[0]);
				S.mark2 = Integer.parseInt(mark[1]);
				S.mark3 = Integer.parseInt(mark[2]);
				
				if(S.mark1 < 0 || S.mark2 < 0 || S.mark3 < 0) {
					throw new NegativeNumberException("No Negative Number");
				}
				else if( (S.mark1>=0 && S.mark1<=100) || (S.mark1>=0 && S.mark1<=100) ||  (S.mark1>=0 && S.mark1<=100) ) {
					throw new OutOfRangeException("Value Out of Range. Please enter within the range 0-100.");
				}
	
				System.out.println("Average = "+S.Average());
			}
			catch(NegativeNumberException e) {
				System.out.println(e.getMessage());
			}
			catch(OutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}

			
		}
		
		scan.close();
	}

}
