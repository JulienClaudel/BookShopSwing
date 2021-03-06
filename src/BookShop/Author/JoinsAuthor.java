package BookShop.Author;

import BookShop.Book.Book_JPanel;
import BookShop.Book.CompleteBook;
import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinsAuthor 
{
    GetConnection con = new GetConnection();
    
    public Vector getDataColumnAuthor() 
    {
        Vector v = new Vector();
            v.add("ID");
            v.add("First Name");
            v.add("Last Name");
            v.add("Birth Date");
            v.add("Death Date");
            v.add("Status");
            
            return v;
    }
    
    public Vector getDataRowAuthor() {
        Vector vectorAuthor = new Vector();
            
        String query =  "SELECT a.AuthorId, AuthorFirstname, AuthorLastname, AuthorBirthdate, AuthorDeathdate, StatusTypeLabel\n" +
                        "FROM AUTHOR a\n" +
                        "INNER JOIN SETWRITER sw\n" +
                        "ON a.AuthorId = sw.AuthorId\n" +   
                        "INNER JOIN STATUSTYPE st\n" +
                        "ON st.StatusTypeId = sw.StatusTypeId\n" +
                        "ORDER BY AuthorId";
            
        try {  
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
            
            while (rs.next()) {
               CompleteAuthor a = new CompleteAuthor(
                        rs.getLong("AuthorId"),
                        rs.getString("AuthorFirstname"),
                        rs.getString("AuthorLastname"),
                        rs.getDate("AuthorBirthdate"),
                        rs.getDate("AuthorDeathdate"),
                        rs.getString("StatusTypeLabel"));
                vectorAuthor.add(a.getVector());
            }
            
            return vectorAuthor;
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vectorAuthor;
    }
    
    public Vector getDataColumnBook() 
    {
        Vector v = new Vector();
            v.add("ISBN");
            v.add("Title");
            v.add("Author");
            v.add("Sub-Theme");
            v.add("Price");

            return v;
    }

    public Vector getDataRowBook(String b)
    {
        Vector vectorBook = new Vector();
            
        String query =  "SELECT BookIsbn, BookCover, BookTitle, CONCAT(AuthorLastname , ' ' ,AuthorFirstname)as BookAuthor, SubThemeLabel,\n" +
                        "BookPrice, BookNote\n" +
                        "FROM BOOK b\n" +
                        "LEFT JOIN AUTHOR a\n" +
                        "ON b.AuthorId = a.AuthorId\n" +
                        "LEFT JOIN SUBTHEME st\n" +
                        "ON b.SubThemeId = st.SubThemeId\n" +
                        "WHERE CONCAT(AuthorLastname , ' ' ,AuthorFirstname) = '" + b + "'";
        try {  
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while (rs.next()) {
                CompleteBook book = new CompleteBook(
                        rs.getString("BookIsbn"),
                        rs.getString("BookTitle"),
                        rs.getString("BookAuthor"),
                        rs.getString("SubThemeLabel"),
                        rs.getBigDecimal("BookPrice"));
                vectorBook.add(book.getVector());
            }
      
            return vectorBook;
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vectorBook;
    }
}
