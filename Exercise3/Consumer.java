package Exercise3;

class Consumer {
	synchronized public void consume(Inventory inventory) {
		
		if(inventory.count == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		inventory.count--;
		System.out.println("Item Consumed -> Count : "+inventory.count);
		notify();
	}
}