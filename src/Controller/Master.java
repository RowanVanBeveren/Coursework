package Controller;

import Model.Books;
import Model.BooksService;
import Model.DatabaseConnection;
import View.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.ArrayList;
import java.util.Optional;

public class Master extends Application {

    public static DatabaseConnection database;

    public static Stage masterStage;

    public static Scene loginScene;
    public static Scene librarianLoginScene;
    public static Scene detailsScene;
    public static Scene mainScene;
    public static Scene myBooksScene;
    public static Scene searchScene;
    public static Scene newUserScene;
    public static Scene librarianScene;
    public static TextField textFieldMessage1;



    public static void main(String[] args) {

        database = new DatabaseConnection("Database/Library management.db");

        loginScene = LoginScene.prepareScene();
        librarianLoginScene = LibrarianLoginScene.prepareScene();
        detailsScene = DetailsScene.prepareStage();
        mainScene = MainScene.prepareScene();
        myBooksScene = MyBooksScene.prepareScene();
        searchScene = SearchScene.prepareScene();
        newUserScene = AddUserScene.prepareScene();
        librarianScene = LibrarianScene.prepareScene();


        ArrayList<Books> testList = new ArrayList<>();
        BooksService.selectAll(testList, database);

        for (Books b: testList) {
            System.out.println(b);
        }



        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        masterStage = stage;
        stage.setResizable(false);

        stage.getIcons().add(new Image(Master.class.getResourceAsStream("../Resources/logo.PNG")));

        stage.setTitle("Library Management");
        stage.show();
        stage.setOnCloseRequest((WindowEvent we) -> displayCloseDialog(we));
        stage.setScene(loginScene);





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
        database.disconnect();
        System.out.println("bye bye!");
        System.exit(0);
    }




}
