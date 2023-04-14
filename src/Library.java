import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements Searchable{
	
	public Library() {}
	
	public Library(List<Book> libraryBooks) {
		this.libraryBooks = libraryBooks;
	}

	
	private List<Book> libraryBooks = new ArrayList<>();

	@Override
	public List<Book> search(String isbn, String bookTitle, List<String> authors) {
		if (isbn != null && !isbn.isEmpty()) {
			List<Book> listBooks = libraryBooks
					.stream().filter(book -> book.getIsbn().equals(isbn)).collect(Collectors.toList());
			if (listBooks.size() > 0) {
				return listBooks;
			}
		}
		
		if (bookTitle != null && !bookTitle.isEmpty()) {
			List<Book> listBooks = libraryBooks
					.stream().filter(book -> book.getTitle().equals(bookTitle)).collect(Collectors.toList());
			if (listBooks.size() > 0) {
				return listBooks;
			}
		}
		
		if (authors != null && !authors.isEmpty()) {
			List<Book> listBooks = libraryBooks
					.stream().filter(book -> {
						for (String author : authors) {
							if (!book.getAuthors().contains(author)) {
								return false;
							}
						}
						return true;
						
						}).collect(Collectors.toList());
			if (listBooks.size() > 0) {
				return listBooks;
			}
		}
		
		return new ArrayList<Book>();
	}

	public List<Book> getLibraryBooks() {
		return libraryBooks;
	}

	public void setLibraryBooks(List<Book> libraryBooks) {
		this.libraryBooks = libraryBooks;
	}
	
	
}
