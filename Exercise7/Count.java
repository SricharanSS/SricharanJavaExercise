package Exercise7;

class Count {
	int count;
	Count() {
		count = 0;
	}
	public void count() {
		count++;
		System.out.print(count+" ");
		if(count%10 == 0) {
			System.out.println("Hello World....");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

