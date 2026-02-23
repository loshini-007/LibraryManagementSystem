package com.library.servlet; import java.io.IOException;
import jakarta.servlet.ServletException; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest; import jakarta.servlet.http.HttpServletResponse; import com.library.dao.BookDAO;
import com.library.dao.BookDAOImpl; import com.library.model.Book; @WebServlet("/updateBook")
public class UpdateBookServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id")); String title = request.getParameter("title");
 
String author = request.getParameter("author"); String genre = request.getParameter("genre"); String status = request.getParameter("status"); Book book = new Book();
book.setId(id); book.setTitle(title); book.setAuthor(author); book.setGenre(genre); book.setStatus(status);
BookDAO dao = new BookDAOImpl(); dao.updateBook(book); response.sendRedirect("viewBooks");
}
}
