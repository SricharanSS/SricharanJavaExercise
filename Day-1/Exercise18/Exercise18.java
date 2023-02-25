package Exercise18;
import java.util.*;
public class Exercise18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scan.nextInt();
		int Arr[] = new int[10];
		int size = 0;
		
		while(num !=0 ) {
			Arr[size++] = num%10;
			num = num/10;
		}
		
		for(int i=size-1; i>=0; i--) {
			
			switch(Arr[i]) {
			
			case 1: System.out.print("one ");
					break;
			case 2: System.out.print("two ");
					break;
			case 3: System.out.print("three ");
					break;
			case 4: System.out.print("four ");
					break;
			case 5: System.out.print("five ");
					break;
			case 6: System.out.print("six ");
					break;
			case 7: System.out.print("seven ");
					break;
			case 8: System.out.print("eight ");
					break;
			case 9: System.out.print("nine ");
					break;
			}
			
			if(i == 3) {
				System.out.print("thousand ");
			}
			else if(i == 2) {
				System.out.print("hundred ");
			}
			else if(i == 1) {
				switch(Arr[i]) {
				case 2: System.out.print("twenty ");
						break;
				case 3: System.out.print("thrity ");
						break;
				case 4: System.out.print("forty ");
						break;
				case 5: System.out.print("fivty ");
						break;
				case 6: System.out.print("sixty ");
						break;
				case 7: System.out.print("seventy ");
						break;
				case 8: System.out.print("eighty ");
						break;
				case 9: System.out.print("ninety ");
						break;
				case 1: 
						if(Arr[i-1] == 1) {
							System.out.print("eleven.");
						}
						else if(Arr[i-1] == 2) {
							System.out.print("twelve.");
						}
						else if(Arr[i-1] == 3) {
							System.out.print("thirteen.");
						}
						else if(Arr[i-1] == 4) {
							System.out.print("fourteen.");
						}
						else if(Arr[i-1] == 5) {
							System.out.print("fifteen.");
						}
						else if(Arr[i-1] == 6) {
							System.out.print("sixteen.");
						}
						else if(Arr[i-1] == 7) {
							System.out.print("seventeen.");
						}
						else if(Arr[i-1] == 8) {
							System.out.print("eighteen.");
						}
						else if(Arr[i-1] == 9) {
							System.out.print("nineteen.");
						}
				}
			}
		}
		
		scan.close();
	}
}
