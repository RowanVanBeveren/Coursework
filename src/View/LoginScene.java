package View;

import Controller.LoginController;
import Controller.Master;
import Controller.SearchController;
import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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

        passwordField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)){
                    LoginController.loginVerification(userField, passwordField, database);

                }

            }
        });

        Button login = new Button("Login");
        login.setLayoutX(577);
        login.setLayoutY(430);
        loginPage.getChildren().add(login);

        Button newUser = new Button("Sign up");
        newUser.setLayoutX(960);
        newUser.setLayoutY(0);
        loginPage.getChildren().add(newUser);

        Button libLogin = new Button ("Librarian Login");
        libLogin.setLayoutX(0);
        libLogin.setLayoutY(0);
        loginPage.getChildren().add(libLogin);

        login.setOnAction((ae) -> LoginController.loginVerification(userField, passwordField, database));
        newUser.setOnAction((ae) -> LoginController.addUser());
        libLogin.setOnAction((ae) -> LoginController.librarianLogin());
        return scene;

    }

}










