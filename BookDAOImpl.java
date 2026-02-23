public void addBook(Book book) {
try (Connection con = DBConnection.getConnection()) {
String sql = "INSERT INTO books(title,author,genre,status) VALUES(?,?,?,?)"; PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, book.getTitle()); ps.setString(2, book.getAuthor()); ps.setString(3, book.getGenre()); ps.setString(4, book.getStatus());
  ps.executeUpdate();
} catch(Exception e){ e.printStackTrace();
}
}
