package View;

import Controller.AddUserController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import Model.DatabaseConnection;


import static Controller.Master.database;

public class AddUserScene {


    public static TextField newUserNameField;
    public static TextField town;
    public static TextField email;
    public static TextField postcode;
    public static TextField firstName;
    public static TextField surname;
    private static PasswordField newUserPassword;
    private static PasswordField confirmPassword;


    public static Scene prepareScene(){

        Pane addUserPage = new Pane();
        Scene scene = new Scene(addUserPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        Text pageTitle = new Text();
        pageTitle.setText("New User Page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(100);
        addUserPage.getChildren().add(pageTitle);



        newUserNameField = new TextField();//adds a box that you are able to write a message in
        newUserNameField.setLayoutX(402);
        newUserNameField.setLayoutY(100);
        newUserNameField.setPrefWidth(220);
        newUserNameField.setPromptText("User Name");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(newUserNameField);

        newUserPassword = new PasswordField();//adds a box that you are able to write a message in
        newUserPassword.setLayoutX(402);
        newUserPassword.setLayoutY(140);
        newUserPassword.setPrefWidth(220);
        newUserPassword.setPromptText("New Password");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(newUserPassword);


        confirmPassword = new PasswordField();//adds a box that you are able to write a message in
        confirmPassword.setLayoutX(402);
        confirmPassword.setLayoutY(180);
        confirmPassword.setPrefWidth(220);
        confirmPassword.setPromptText("Confirm Password");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(confirmPassword);

        firstName = new TextField();//adds a box that you are able to write a message in
        firstName.setLayoutX(402);
        firstName.setLayoutY(220);
        firstName.setPrefWidth(220);
        firstName.setPromptText("First Name");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(firstName);



        surname = new TextField();//adds a box that you are able to write a message in
        surname.setLayoutX(402);
        surname.setLayoutY(260);
        surname.setPrefWidth(220);
        surname.setPromptText("Surname");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(surname);

        town = new TextField();//adds a box that you are able to write a message in
        town.setLayoutX(402);
        town.setLayoutY(300);
        town.setPrefWidth(220);
        town.setPromptText("Town");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(town);

        email = new TextField();//adds a box that you are able to write a message in
        email.setLayoutX(402);
        email.setLayoutY(340);
        email.setPrefWidth(220);
        email.setPromptText("Street");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(email);

        postcode = new TextField();//adds a box that you are able to write a message in
        postcode.setLayoutX(402);
        postcode.setLayoutY(380);
        postcode.setPrefWidth(220);
        postcode.setPromptText("Postcode");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(postcode);

        Button addUserButton = new Button();
        addUserButton.setText("Save Changes");
        addUserButton.setLayoutX(550);
        addUserButton.setLayoutY(420);
        //addUserButton.setOnAction((ae) -> AddUserController.saveChanges(newUserNameField, newUserPassword, confirmPassword, firstName, surname, town, email, postcode, database));
        addUserPage.getChildren().add(addUserButton);


        Button returnButton = new Button();
        returnButton.setId("backButton");
        returnButton.setLayoutX(0);
        returnButton.setLayoutY(0);
        returnButton.setOnAction((ae) -> AddUserController.goBackToLogin());
        addUserPage.getChildren().add(returnButton);

        return scene;


    }

}
