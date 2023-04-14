import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<String> authorsBook1 = new ArrayList<>();
		authorsBook1.add("Mohammed1");
		authorsBook1.add("abed");
		Book book = new Book("book1", authorsBook1, "123", false);
		
		
		List<String> authorsBook2 = new ArrayList<>();
		authorsBook2.add("Mohammed3");
		Book book2 = new Book("book2", authorsBook2, "321", false);
		
		
		List<Book> books = new ArrayList<>();
		books.add(book);
		books.add(book2);
		
		Library library = new Library(books);
		
		Checkout checkout = new Checkout(library);
		
		List<String> authorsToSearchFor = new ArrayList<>();
		authorsToSearchFor.add("abed");
		
		// Book bookToSearch = new Book(null, authorsToSearchFor, null, false);
		// Book bookToSearch = new Book(null, null, "123", false);
		Book bookToSearch = new Book("book2", null, null, false);
		Borrower borrower = new Borrower("mohammed", "+223456789", Arrays.asList("programming"), new ArrayList<>());
		
		Book bookBorrowed = checkout.checkout(bookToSearch, borrower);
		
		if (bookBorrowed == null) {
			System.out.println("Book Not Found or already borrowed by someone else!");
		} else {
			System.out.println("Book Found and has been borrowed to you: " + bookBorrowed);
		}
		
		
	}

}
