package Controller;

import Model.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddUserController {

    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

   /* public static void saveChanges(TextField newUserName, PasswordField newUserPassword, TextField firstName, TextField surname, TextField town, TextField email, TextField postcode, DatabaseConnection database){


            String userName = newUserName.getText();
            String Password = newUserPassword.getText();
            String FirstName = firstName.getText();
            String Surname = surname.getText();
            String Town = town.getText();
            String Email = email.getText();
            String Postcode = postcode.getText();

        MembersService.save(FirstName, Surname, Town, Email, Postcode, database);
        UsernamesService.save(userName, database);
        PasswordsService.save(Password, database);


    }*/


}









