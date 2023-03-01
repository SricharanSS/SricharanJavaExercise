package Exercise5;

class Task implements Runnable {
	public void run() {
		System.out.println("Thread Running....");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
