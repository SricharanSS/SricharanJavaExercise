package Exercise9;
import java.util.*;

public class Exercise9 {
	public static void main(String[] args) {
		
		StudentMarks S[] = new StudentMarks[10];
		int mark1, mark2, mark3;
		Scanner scan = new Scanner(System.in);
		String input;
		for(int i=0; i<10; i++) {
			System.out.print("Enter the marks of Student "+(i+1)+"(mark 1 mark 2 mark 3) : ");
			input = scan.nextLine();
			try {
				String mark[] = input.split("\\s");
				mark1 = Integer.parseInt(mark[0]);
				mark2 = Integer.parseInt(mark[1]);
				mark3 = Integer.parseInt(mark[2]);
				
				S[i] = new StudentMarks(mark1, mark2, mark3);
				
				if(S[i].mark1 < 0 || S[i].mark2 < 0 || S[i].mark3 < 0) {
					throw new NegativeNumberException("No Negative Number");
				}
				else if( !(S[i].mark1>=0 && S[i].mark1<=100) || !(S[i].mark2>=0 && S[i].mark2<=100) ||  !(S[i].mark3>=0 && S[i].mark3<=100) ) {
					throw new OutOfRangeException("Value Out of Range. Please enter within the range 0-100.");
				}
	
				System.out.println("Average = "+S[i].Average());
			}
			catch(NegativeNumberException e) {
				System.out.println(e.getMessage());
				i = i-1;
			}
			catch(OutOfRangeException e) {
				System.out.println(e.getMessage());
				i = i-1;
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage()+ " [Enter Valid inputs Only]");
				i = i-1;
			}

			
		}
		
		scan.close();
	}

}
