package Exercise3;

class Inventory {
	int count;
	
	private Inventory() {
		count = 0;
	}
	
	private static Inventory inventory;
	
	static public Inventory getInventory() {
		if(inventory == null) {
			inventory = new Inventory();
		}
		
		return inventory;
	}
	
}