package Exercise15;

public class Exercise15a {
	public static void main(String[] args) {
		
		for(int num=1; num<=100; num++) {
			
			boolean flag = true;
			for(int i=2; i<=num/2; i++) {
				if(num % i == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println(num);
			}
		}
		
	}

}
