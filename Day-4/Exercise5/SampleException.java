package Exercise5;

class SampleException extends Exception {
	String msg;
	SampleException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}
