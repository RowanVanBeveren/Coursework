package View;

import Controller.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;


public class LoginScene  {

    public static TextField textFieldMessage1;
    private static PasswordField passwordField;

    public static Scene prepareScene() {

        Pane loginPage = new Pane();
        Scene scene = new Scene(loginPage, 1024, 768);

        textFieldMessage1 = new TextField();
        textFieldMessage1.setLayoutX(20);
        textFieldMessage1.setLayoutY(100);
        textFieldMessage1.setPrefWidth(220);
        textFieldMessage1.setPromptText("Username");
        loginPage.getChildren().add(textFieldMessage1);

        passwordField = new PasswordField();
        passwordField.setLayoutX(20);
        passwordField.setLayoutY(140);
        passwordField.setPrefWidth(220);
        passwordField.setPromptText("Your password");
        ;
        loginPage.getChildren().add(passwordField);

        Button login = new Button("Login");
        login.setLayoutX(20);
        login.setLayoutY(220);
        loginPage.getChildren().add(login);

        login.setOnAction((ae) -> LoginController.tryLogin()); // Changes the login page to the main page has to be here so it is declared after scene2 is

        return scene;

    }

}










