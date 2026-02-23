@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) { Book book = new Book();
book.setTitle(request.getParameter("title")); book.setAuthor(request.getParameter("author")); 
book.setGenre(request.getParameter("genre")); book.setStatus(request.getParameter("status")); 
BookDAO dao = new BookDAOImpl(); dao.addBook(book); response.sendRedirect("viewBooks");
}
}
