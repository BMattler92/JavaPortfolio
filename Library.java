//Barbara
public class Library {
	private String libraryName;
	private Book book;
	
	public Library(String libraryName, Book book) {
		super();
		this.libraryName = libraryName;
		this.book= new Book(book);
	}
	public Library(String libraryName) {
		
		this.libraryName = libraryName;
		
	}
	
	public String getLibraryName() 
	{
		return libraryName;
	}

	@Override
	public String toString() {
		String str= "Library" + libraryName + 
				"\nBook information " + book.toString();
		
		return str;
		
	}
	
}
