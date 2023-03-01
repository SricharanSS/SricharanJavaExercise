package Exercise6;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Scanner;


public class Exercise6 {
	
	static boolean loop;
	
	public static void main(String[] args) throws NonAlphaException {
		ExecutorService service = Executors.newFixedThreadPool(1);
		Scanner scan = new Scanner(System.in);
		loop = true;
		Count obj = new Count();
		
		
		while(loop)  {
			
			service.execute(() -> {
				String ch = scan.next();
				
				if( !(Character.isLetter(ch.charAt(0))) ) {
					loop = false;
					System.out.println("Count = "+obj.count);
					try {
					throw new NonAlphaException("Non Alpha is entered....");
					}
					catch(Exception e) {
						System.out.println(e);
						System.exit(0);
					}
				}
				else {
					obj.Increment();
				}
				
			});
			
		}
		
		service.shutdown();
		
	}
}
