package BuilderPattern;

class Phone {
	int ScreenSize;
	int ProcessorCount;
	int Ram;
	int Storage;
	
	private Phone() {
		
	}
	
	public void setScreenSize(int ScreenSize) {
		this.ScreenSize = ScreenSize;
	}
	public void setProcessorCount(int ProcessorCount) {
		this.ProcessorCount = ProcessorCount;
	}
	public void setRam(int Ram) {
		this.Ram = Ram;
	}
	public void setStorage(int Storage) {
		this.Storage = Storage;
	}
	
	public static Phone getPhone() {
		return new Phone();
	}
	
}
