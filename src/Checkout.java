import java.util.List;

public class Checkout {
	
	Library library;
	
	public Checkout() {}
	
	public Checkout(Library library) {
		this.library = library;
	}
	
	public Book checkout(Book book, Borrower borrower) {
		List<Book> booksFound = library.search(book.getIsbn(), book.getTitle(),book.getAuthors());
		if (booksFound.size() > 0) {
			Book bookFound = booksFound.get(0);
			if (!bookFound.isBorrowed()) {
				int bookIndex = library.getLibraryBooks().indexOf(bookFound);
				bookFound.setBorrowed(true);
				borrower.getBooksBorrowed().add(bookFound);
				library.getLibraryBooks().set(bookIndex, bookFound);
				return bookFound;
			} else {
				return null;
			}
			
		}
		return null;
	}
}
