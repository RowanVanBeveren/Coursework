package View;

import Controller.LoginController;
import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sun.plugin.dom.core.Text;

import java.util.Optional;
import java.util.Scanner;

import static Controller.Master.database;


public class LoginScene  {

    public static TextField userField;
    private static PasswordField passwordField;

    public static Scene prepareScene() {

        Pane loginPage = new Pane();
        Scene scene = new Scene(loginPage, 1024, 768);

        Image logo = new Image("Resources/logo.png");
        ImageView logoView = new ImageView(logo);
        logoView.setX(385);
        logoView.setY(60);
        loginPage.getChildren().add(logoView);



        userField = new TextField("");
        userField.setLayoutX(402);
        userField.setLayoutY(364);
        userField.setPrefWidth(220);
        userField.setPromptText("Username");
        loginPage.getChildren().add(userField);

        passwordField = new PasswordField();
        passwordField.setLayoutX(402);
        passwordField.setLayoutY(394);
        passwordField.setPrefWidth(220);
        passwordField.setPromptText("Your password");
        loginPage.getChildren().add(passwordField);

        Button login = new Button("Login");
        login.setLayoutX(577);
        login.setLayoutY(430);
        loginPage.getChildren().add(login);

        Button newUser = new Button("Sign up");
        newUser.setLayoutX(965);
        newUser.setLayoutY(0);
        loginPage.getChildren().add(newUser);

        login.setOnAction((ae) -> LoginController.loginVerification(userField, passwordField, database));
        newUser.setOnAction((ae) -> LoginController.addUser());
        return scene;

    }

}










