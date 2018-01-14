package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoansService {

    public static void selectAll(List<Loans> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT BookID, MemberID, DataOut, DateI FROM Loans");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Loans(
                                results.getInt("BookID"),
                                results.getInt("MemberID"),
                                results.getDate("DateOut"),
                                results.getDate("DateIn")));
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
