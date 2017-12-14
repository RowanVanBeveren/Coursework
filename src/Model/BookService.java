package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookService {

    public static void selectAll(List<Book> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT BookID, BookName, PublisherID, GenreName, AuthorID FROM Books");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Book(
                                results.getInt("BookID"),
                                results.getString("BookName"),
                                results.getInt("PublisherID"),
                                results.getString("GenreName"),
                                results.getInt("AuthorID")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }




}



