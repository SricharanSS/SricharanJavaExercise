package CommandPattern;

class TV implements RemoteReceiver {
	
	@Override
	public void switchOn() {
		System.out.println("TV turned on....");
	}

	@Override
	public void switchOff() {
		System.out.println("TV turned off....");
	}

	@Override
	public void Increase() {
		System.out.println("Volume increased....");
	}

	@Override
	public void Decrease() {
		System.out.println("Volume decreased....");
	}
	
}