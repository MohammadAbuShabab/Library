import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private List<String> authors = new ArrayList<>();
	private String isbn;
	private boolean isBorrowed;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, List<String> authors, String isbn, boolean isBorrowed) {
		super();
		this.title = title;
		if (authors != null) {
			this.authors = new ArrayList<>(authors);
		} else {
			this.authors = new ArrayList<String>();
		}
		
		this.isbn = isbn;
		this.isBorrowed = isBorrowed;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", isbn=" + isbn + ", isBorrowed=" + isBorrowed + "]";
	}
	
	
	
	
	

}
