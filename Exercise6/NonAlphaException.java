package Exercise6;

class NonAlphaException extends Exception {
	String msg;
	NonAlphaException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}
