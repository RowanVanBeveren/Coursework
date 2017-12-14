package View;

import Controller.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        Image logo = new Image("Resources/logo.png");
        ImageView logoView = new ImageView(logo);
        logoView.setX(385);
        logoView.setY(60);
        loginPage.getChildren().add(logoView);

        textFieldMessage1 = new TextField();
        textFieldMessage1.setLayoutX(402);
        textFieldMessage1.setLayoutY(364);
        textFieldMessage1.setPrefWidth(220);
        textFieldMessage1.setPromptText("Username");
        loginPage.getChildren().add(textFieldMessage1);

        passwordField = new PasswordField();
        passwordField.setLayoutX(402);
        passwordField.setLayoutY(394);
        passwordField.setPrefWidth(220);
        passwordField.setPromptText("Your password");
        ;
        loginPage.getChildren().add(passwordField);

        Button login = new Button("Login");
        login.setLayoutX(577);
        login.setLayoutY(430);
        loginPage.getChildren().add(login);

        Button newUser = new Button("Sign up");
        newUser.setLayoutX(965);
        newUser.setLayoutY(0);
        loginPage.getChildren().add(newUser);

        login.setOnAction((ae) -> LoginController.tryLogin()); // Changes the login page to the main page has to be here so it is declared after scene2 is
        newUser.setOnAction((ae) -> LoginController.addUser());
        return scene;

    }

}










