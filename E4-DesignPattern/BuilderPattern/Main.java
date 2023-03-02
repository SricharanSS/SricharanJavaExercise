package BuilderPattern;

public class Main {
	public static void main(String[] args) {
		
		Phone redmi = Phone.getPhone();
		redmi.setProcessorCount(4);
		redmi.setRam(6);
		redmi.setScreenSize(14);
		redmi.setStorage(128);
		
		System.out.println("Redmi Specs:");
		System.out.println("Processor Count = "+redmi.ProcessorCount);
		System.out.println("Screen Size = "+redmi.ScreenSize);
		System.out.println("Ram = "+redmi.Ram);
		System.out.println("Storage = "+redmi.Storage);
	}
}
