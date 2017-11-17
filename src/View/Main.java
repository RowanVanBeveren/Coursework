package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;


public class Main extends Application {


    private static Stage masterStage;
    private static TextField textFieldMessage1;

    private static PasswordField passwordField;
        @Override
        public void start(Stage stage) throws Exception {

            masterStage = stage;


            Pane loginPage = new Pane();
            Scene scene = new Scene(loginPage, 1024, 768);

            stage.setTitle("Library Management");
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest((WindowEvent we) -> displayCloseDialog(we));

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
            passwordField.setPromptText("Your password");;
            loginPage.getChildren().add(passwordField);

            Button login = new Button("Login");
            login.setLayoutX(20);
            login.setLayoutY(220);
            loginPage.getChildren().add(login);

            login.setOnAction((ActionEvent ae) -> Scene2.launch(masterStage, scene)); // Changes the login page to the main page has to be here so it is declared after scene2 is



        }// ANYTHING FOR IT TO LOOK COOL ABOVE THIS



        public static void main(String[] args) {
            launch(args);
        }



        private static void displayCloseDialog(WindowEvent we){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Leaving already?");
            alert.setContentText("Are you sure you want to quit?");

            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                terminate();
            }
            else{
                we.consume();
            }
        }
        private static void terminate()
    {
        System.out.println("bye bye!");
        System.exit(0);
    }
}










