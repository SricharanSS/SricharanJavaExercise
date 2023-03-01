package Exercise3;

class Producer {
	synchronized public void produce(Inventory inventory) {
		if(inventory.count == 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		inventory.count++;
		System.out.println("Item Produced -> Count : "+inventory.count);
		notify();
	}
}
