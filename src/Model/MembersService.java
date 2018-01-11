package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MembersService {

    public static void selectAll(List<Members> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT MemberID, FirstName, Surname, Town, County, Postcode, Email, PasswordID, UserNameID FROM Members");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Members(
                                results.getInt("MemberID"),
                                results.getString("FirstName"),
                                results.getString("Surname"),
                                results.getString("Town"),
                                results.getString("County"),
                                results.getString("Postcode"),
                                results.getString("Email"),
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


    public static void save(Members members, DatabaseConnection database) { }	// insert & update


    public static void deleteById(int id, DatabaseConnection database) { }
}
