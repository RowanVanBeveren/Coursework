package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PasswordsService {

    public static void selectAll(List<Passwords> targetList, DatabaseConnection database) {
        PreparedStatement statement = database.newStatement("SELECT PasswordID, Password FROM Passwords");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Passwords(
                                results.getInt("PasswordID"),
                                results.getString("Password")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }





    //public static  selectById(int id, DatabaseConnection database) { }
    public static void save(Passwords passwords, DatabaseConnection database) { }	// insert & update
    public static void deleteById(int id, DatabaseConnection database) { }
}
