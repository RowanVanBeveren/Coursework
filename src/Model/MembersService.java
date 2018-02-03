package Model;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Model.DatabaseConnection;

import java.lang.reflect.Member;
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


    /*public static void loginCheck(List<Usernames> usernamesList , List<Passwords> passwordsList, TextField userField, PasswordField passwordField, DatabaseConnection database){

        String userName = userField.getText();
        String password = passwordField.getText();

        String dUserName = "";
        String dPassword = "";

        PreparedStatement login = database.newStatement("SELECT UserNameID FROM UserNames WHERE UserName =`" + userName + "&& SELECT PasswordID FROM Passwords WHERE Password =`" + password+ "`"   );
    }*/




    //public static  selectById(int id, DatabaseConnection database) { }


   /* public static void save(Members members, String FirstName , String Surname,  String Town, String Email, String Postcode, DatabaseConnection database) {

        try
    {
        PreparedStatement statement = database.newStatement("INSERT INTO Members (FirstName, Surname) VALUES (?, ?)");

        statement.setString(2, members.setFirstName(String firstName));
        statement.setString(3, members.Surname);
        statement.setString(4, members.Town);


        if (statement != null) {
            database.executeUpdate(statement);
        }

    }
    catch (SQLException resultsexception) {
        System.out.println("Database result processing error: " + resultsexception.getMessage());
    }}	// insert & update*/


    public static void deleteById(int id, DatabaseConnection database) { }
}
