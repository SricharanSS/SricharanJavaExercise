package Exercise8;
import java.util.*;

class StudentMarks {
	int mark1,mark2,mark3;
	
	public int Average() {
		return (mark1+mark2+mark3)/3;
	}
}

public class Exercise8 {
	public static void main(String[] args) throws Exception {
		StudentMarks S = new StudentMarks();
		Scanner scan = new Scanner(System.in);
		String input;
		for(int i=0; i<10; i++) {
			System.out.print("Enter the marks of Student "+(i+1)+"(mark 1 mark 2 mark 3) : ");
			input = scan.nextLine();
		
			try {
				String mark[] = input.split("\\s");
				S.mark1 = Integer.parseInt(mark[0]);
				S.mark2 = Integer.parseInt(mark[1]);
				S.mark3 = Integer.parseInt(mark[2]);
	
				System.out.println("Average = "+S.Average());
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage()+" [Enter Only Numuric Values]");
				i = i-1;
			}
			
			
		}
		
		scan.close();
	}

}
