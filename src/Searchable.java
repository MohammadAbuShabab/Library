import java.util.List;

public interface Searchable {
	List<Book> search(String isbn, String bookTitle, List<String> authors);
}
