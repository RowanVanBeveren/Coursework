package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LibrariansService {


        public static void selectAll(List<Librarians> targetList, DatabaseConnection database) {


            PreparedStatement statement = database.newStatement("SELECT LibrarianID, FirstName, Surname, Rank, PasswordID, UserNameID FROM Librarians");

            try {
                if (statement != null) {

                    ResultSet results = database.executeQuery(statement);

                    if (results != null) {
                        while (results.next()) {
                            targetList.add(new Librarians(
                                    results.getInt("LibrarianID"),
                                    results.getString("FirstName"),
                                    results.getString("Surname"),
                                    results.getString("Rank"),
                                    results.getInt("PasswordID"),
                                    results.getInt("UserNameID")));
                        }
                    }
                }
            } catch (SQLException resultsException) {
                System.out.println("Database select all error: " + resultsException.getMessage());
            }
        }
        //public static  selectById(int id, DatabaseConnection database) { }
        public static void save(Librarians librarians, DatabaseConnection database) { }	// insert & update
        public static void deleteById(int id, DatabaseConnection database) { }


}
