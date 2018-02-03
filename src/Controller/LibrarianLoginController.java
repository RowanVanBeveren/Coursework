package Controller;

import Model.DatabaseConnection;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibrarianLoginController {

    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

    public static void loginVerification(TextField libuserField, PasswordField libpasswordField, DatabaseConnection database){



        String userName = libuserField.getText();
        String password = libpasswordField.getText();


        String dPassword = "";

        PreparedStatement stmt = database.newStatement("SELECT Password FROM Passwords WHERE PasswordID = (SELECT PasswordID From Librarians WHERE UserNameID = (SELECT UserNameID FROM UserNames WHERE UserName = '"+userName+"'));" );

        try {
            if (stmt != null) {

                ResultSet result = stmt.executeQuery();

                while (result.next()) {

                    dPassword = result.getString("Password");
                }

                if(libuserField.getText().equals("") && libpasswordField.getText().equals("")){
                    Alert badLogin = new Alert(Alert.AlertType.ERROR);
                    badLogin.setTitle("No Login Details");
                    badLogin.setHeaderText("No Username or Password ");
                    badLogin.setContentText("No Username or Password please try again");
                    badLogin.showAndWait();
                }
                else if(password.equals(dPassword)){
                    Master.masterStage.setScene(Master.librarianScene);
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
            System.out.println("Database comparison error: " + resultsException.getMessage());
        }





    }
}
