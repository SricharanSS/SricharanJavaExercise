package Exercise8;

class Singlton {
	
	public int num = 10;
	
	private Singlton() {
		
	}
	
	private static Singlton S;
	
	public static Singlton returnObj() {
		if(S == null) {
			S = new Singlton();
			return S;
		}
		else {
			return S;
		}
	}
	
}
