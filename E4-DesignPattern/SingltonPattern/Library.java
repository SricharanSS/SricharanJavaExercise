package SingltonPattern;

class Library {
	
	int bookCount;
	
	private Library() {
		bookCount = 0;
	}
	
	private static Library library;
	
	
	public static Library getLibrary() {
		if(library == null) {
			library = new Library();
		}
		return library;
	}
	
}
