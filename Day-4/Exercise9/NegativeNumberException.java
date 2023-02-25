package Exercise9;

class NegativeNumberException extends Exception {
	String msg;
	NegativeNumberException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		return msg;
	}
}