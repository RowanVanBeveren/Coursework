package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsernamesService {

    public static void selectAll(List<Usernames> targetList, DatabaseConnection database) {
        PreparedStatement statement = database.newStatement("SELECT UserNameID, UserName FROM UserNames");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Usernames(
                                results.getInt("UserNameID"),
                                results.getString("UserName")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }




    //public static  selectById(int id, DatabaseConnection database) { }
    public static void save(String userName, DatabaseConnection database) { }	// insert & update
    public static void deleteById(int id, DatabaseConnection database) { }
}
