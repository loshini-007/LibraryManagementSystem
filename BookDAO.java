package com.library.dao; import java.util.List;
import com.library.model.Book; public interface BookDAO {
void addBook(Book book); List<Book> getAllBooks(); void updateBook(Book book); void deleteBook(int id);
}
