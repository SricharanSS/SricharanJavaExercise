package Exercise9;

class OutOfRangeException extends Exception {
	String msg;
	OutOfRangeException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}
