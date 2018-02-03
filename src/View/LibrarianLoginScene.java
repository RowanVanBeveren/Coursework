package View;

import Controller.AddUserController;
import Controller.LibrarianLoginController;
import Controller.LoginController;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import static Controller.Master.database;

public class LibrarianLoginScene {


    public static TextField libuserField;
    private static PasswordField libpasswordField;

    public static Scene prepareScene() {

        Pane librarianLoginScene = new Pane();
        Scene scene = new Scene(librarianLoginScene, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        Image logo = new Image("Resources/logo.png");
        ImageView logoView = new ImageView(logo);
        logoView.setX(385);
        logoView.setY(60);
        librarianLoginScene.getChildren().add(logoView);


        libuserField = new TextField("");
        libuserField.setLayoutX(402);
        libuserField.setLayoutY(364);
        libuserField.setPrefWidth(220);
        libuserField.setPromptText("Username");
        librarianLoginScene.getChildren().add(libuserField);

        libpasswordField = new PasswordField();
        libpasswordField.setLayoutX(402);
        libpasswordField.setLayoutY(394);
        libpasswordField.setPrefWidth(220);
        libpasswordField.setPromptText("Your password");
        librarianLoginScene.getChildren().add(libpasswordField);

        libpasswordField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)){
                    LibrarianLoginController.loginVerification(libuserField, libpasswordField, database);

                }

            }
        });

        Button login = new Button("Login");
        login.setLayoutX(577);
        login.setLayoutY(430);
        librarianLoginScene.getChildren().add(login);

        Button returnButton = new Button();
        returnButton.setId("backButton");
        returnButton.setLayoutX(0);
        returnButton.setLayoutY(0);
        returnButton.setOnAction((ae) -> LibrarianLoginController.goBackToLogin());
        librarianLoginScene.getChildren().add(returnButton);

        login.setOnAction((ae) -> LibrarianLoginController.loginVerification(libuserField, libpasswordField, database));

        return scene;
    }
}
