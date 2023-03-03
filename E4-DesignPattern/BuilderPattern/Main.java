package BuilderPattern;

public class Main {
	public static void main(String[] args) {
		
		Phone redmi = Phone.getPhone();
		redmi.setProcessorCount(4);
		redmi.setRam(6);
		redmi.setScreenSize(14);
		redmi.setStorage(128);
		
		System.out.println("Redmi Specs:"+redmi);
		System.out.println("Processor Count = "+redmi.ProcessorCount);
		System.out.println("Screen Size = "+redmi.ScreenSize);
		System.out.println("Ram = "+redmi.Ram);
		System.out.println("Storage = "+redmi.Storage);
		
		
		Phone realme = Phone.getPhone();
		realme.setProcessorCount(5);
		realme.setRam(6);
		realme.setScreenSize(18);
		realme.setStorage(256);
		
		System.out.println("Realme Specs:"+realme);
		System.out.println("Processor Count = "+realme.ProcessorCount);
		System.out.println("Screen Size = "+realme.ScreenSize);
		System.out.println("Ram = "+realme.Ram);
		System.out.println("Storage = "+realme.Storage);
	}
}
