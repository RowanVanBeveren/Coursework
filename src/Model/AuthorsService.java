package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AuthorsService {
    public static void selectAll(List<Authors> targetList, DatabaseConnection database) {
        PreparedStatement statement = database.newStatement("SELECT AuthorID, Author FROM Authors");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Authors(
                                results.getInt("AuthorID"),
                                results.getString("Author")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    //public static  selectById(int id, DatabaseConnection database) { }
    public static void save(Authors authors, DatabaseConnection database) { }	// insert & update
    public static void deleteById(int id, DatabaseConnection database) { }
}

