package Exercise8;

class MyClass extends Thread {
	StringBuffer obj;
	MyClass(StringBuffer obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		synchronized(obj) {
			for(int i=0; i<100; i++) {
				System.out.println(obj.charAt(0));
			}
			obj.setCharAt(0, (char)(obj.charAt(0)+1));
		}
	}
}
