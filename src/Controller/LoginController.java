package Controller;
import Model.DatabaseConnection;
import Model.MembersService;
import Model.Passwords;
import Model.Usernames;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;
import java.util.List;
import java.util.Optional;

/**
 * Created by Rowan on 03-Nov-17.
 */
public class LoginController {

    public static void loginVerification(TextField userField, PasswordField passwordField, DatabaseConnection database){



        String userName = userField.getText();
        String password = passwordField.getText();


        String dPassword = "";

             PreparedStatement stmt = database.newStatement("SELECT Password FROM Passwords WHERE PasswordID = (SELECT PasswordID From Members WHERE UserNameID = (SELECT UserNameID FROM UserNames WHERE UserName = '"+userName+"'));" );

          try {
            if (stmt != null) {

                     ResultSet result = stmt.executeQuery();

                    while (result.next()) {

                        dPassword = result.getString("Password");
                    }

                     if(userField.getText().equals("") && passwordField.getText().equals("")){
                        Alert badLogin = new Alert(Alert.AlertType.ERROR);
                        badLogin.setTitle("No Login Details");
                        badLogin.setHeaderText("No Username or Password ");
                        badLogin.setContentText("No Username or Password please try again");
                        badLogin.showAndWait();
                    }
                   else if(password.equals(dPassword)){
                    Master.masterStage.setScene(Master.mainScene);
                         }
                    else{
                        Alert badLogin = new Alert(Alert.AlertType.ERROR);
                        badLogin.setTitle("Bad Login");
                        badLogin.setHeaderText("Username or Password incorrect");
                        badLogin.setContentText("Incorrect Username or Password please try again");
                        badLogin.showAndWait();

                    }

               }
            } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }





    }







    public static void addUser() {

        Master.masterStage.setScene(Master.newUserScene);
    }




}
