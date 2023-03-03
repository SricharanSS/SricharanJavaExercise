package SingltonPattern;


public class Main {
	public static void main(String[] args) {
//		Library library = new Library();      // Error as the construtor is declared private
		
		Library library1 = Library.getLibrary();
		library1.bookCount = 30;
		
		Library library2 = Library.getLibrary();
		System.out.println("Book Conunt = "+library2.bookCount+" "+library1);
		System.out.println("Book Conunt = "+library2.bookCount+" "+library2);
	}
}
