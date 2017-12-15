package View;

import Controller.AddUserController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class AddUserScene {

    private static TextField newUserName;
    private static TextField town;
    private static TextField street;
    private static TextField postcode;
    private static TextField firstName;
    private static TextField surname;
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

        Button returnButton = new Button();
        returnButton.setId("backButton");
        returnButton.setLayoutX(0);
        returnButton.setLayoutY(0);
        returnButton.setOnAction((ae) -> AddUserController.goBackToLogin());
        addUserPage.getChildren().add(returnButton);

        newUserName = new TextField();//adds a box that you are able to write a message in
        newUserName.setLayoutX(110);
        newUserName.setLayoutY(0);
        newUserName.setPrefWidth(220);
        newUserName.setPromptText("User Name");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(newUserName);

        newUserPassword = new PasswordField();//adds a box that you are able to write a message in
        newUserPassword.setLayoutX(110);
        newUserPassword.setLayoutY(0);
        newUserPassword.setPrefWidth(220);
        newUserPassword.setPromptText("New Password");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(newUserPassword);


        confirmPassword = new PasswordField();//adds a box that you are able to write a message in
        confirmPassword.setLayoutX(110);
        confirmPassword.setLayoutY(0);
        confirmPassword.setPrefWidth(220);
        confirmPassword.setPromptText("Confirm Password");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(confirmPassword);

        firstName = new TextField();//adds a box that you are able to write a message in
        firstName.setLayoutX(110);
        firstName.setLayoutY(0);
        firstName.setPrefWidth(220);
        firstName.setPromptText("First Name");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(firstName);



        surname = new TextField();//adds a box that you are able to write a message in
        surname.setLayoutX(110);
        surname.setLayoutY(0);
        surname.setPrefWidth(220);
        surname.setPromptText("Surname");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(surname);

        town = new TextField();//adds a box that you are able to write a message in
        town.setLayoutX(110);
        town.setLayoutY(0);
        town.setPrefWidth(220);
        town.setPromptText("Town");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(town);

        street = new TextField();//adds a box that you are able to write a message in
        street.setLayoutX(110);
        street.setLayoutY(0);
        street.setPrefWidth(220);
        street.setPromptText("Street");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(street);

        postcode = new TextField();//adds a box that you are able to write a message in
        postcode.setLayoutX(110);
        postcode.setLayoutY(0);
        postcode.setPrefWidth(220);
        postcode.setPromptText("Postcode");// sets the text to <-- before you type anything
        addUserPage.getChildren().add(postcode);

        Button addUserButton = new Button();
        addUserButton.setId("backButton");
        addUserButton.setLayoutX(0);
        addUserButton.setLayoutY(0);
        addUserButton.setOnAction((ae) -> AddUserController.saveChanges());
        addUserPage.getChildren().add(addUserButton);

        return scene;


    }

}
