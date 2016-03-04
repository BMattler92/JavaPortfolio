
public class LibraryDemo {

	public static void main(String[] args) {
		
		
		Book book=new Book("Hope I Pass","February 2016","Barbara Mattler" );
		
		Library library=new Library("Wesley Library",book);
		
		System.out.print(library);

	}

}
