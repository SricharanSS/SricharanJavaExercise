package Exercise7;

class Count {
	int count;
	Count() {
		count = 0;
	}
	public void count() {
		try {
			count++;
			System.out.print(count+" ");
			if(count%10 == 0) {
				System.out.println("Hello World....");
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

