import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Borrower extends Person implements Searchable {
	
	private List<String> topicsOfInterest = new ArrayList<>();
	private List<Book> booksBorrowed = new ArrayList<>();
	
	
	public Borrower(String name, String contact, List<String> topicsOfInterest, List<Book> booksBorrowed) {
		super(name, contact);
		this.topicsOfInterest =  new ArrayList<>(topicsOfInterest);
		this.booksBorrowed = new ArrayList<>(booksBorrowed);
	}


	public List<String> getTopicsOfInterest() {
		return topicsOfInterest;
	}


	public void setTopicsOfInterest(List<String> topicsOfInterest) {
		this.topicsOfInterest = topicsOfInterest;
	}


	public List<Book> getBooksBorrowed() {
		return booksBorrowed;
	}


	public void setBooksBorrowed(List<Book> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}
	
	@Override
	public List<Book> search(String isbn, String bookTitle, List<String> authors) {
		if (isbn != null && !isbn.isEmpty()) {
			List<Book> listBooks = booksBorrowed
					.stream().filter(book -> book.getIsbn().equals(isbn)).collect(Collectors.toList());
			if (listBooks.size() > 0) {
				return listBooks;
			}
		}
		
		if (bookTitle != null && !bookTitle.isEmpty()) {
			List<Book> listBooks = booksBorrowed
					.stream().filter(book -> book.getTitle().equals(bookTitle)).collect(Collectors.toList());
			if (listBooks.size() > 0) {
				return listBooks;
			}
		}
		
		if (authors != null && !authors.isEmpty()) {
			List<Book> listBooks = booksBorrowed
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
	
	

}
