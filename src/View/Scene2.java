package View;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Rowan on 03-Nov-17.
 */
public class Scene2  { // (View.Scene2 = View.Main page)

    private static Scene scene;

    private static TextField textFieldMessage1;
    private static TextField textFieldMessage2;
    private static TextField textFieldMessage3;

    public static void launch(Stage stage, Scene parentScene) {

        scene = parentScene;

        Pane mainPage = new Pane();
        Scene scene2 = new Scene(mainPage, 1024, 768);
        scene2.getStylesheets().add("Resources/style.css");

        Button myButton = new Button("Search");
        myButton.setLayoutX(20);
        myButton.setLayoutY(220);
        myButton.setOnAction((ActionEvent ae) -> Scene3.launch(stage, scene2, scene));
        mainPage.getChildren().add(myButton);


        textFieldMessage1 = new TextField();//adds a box that you are able to write a message in
        textFieldMessage1.setLayoutX(20);
        textFieldMessage1.setLayoutY(100);
        textFieldMessage1.setPrefWidth(220);
        textFieldMessage1.setPromptText("Enter book name");// sets the text to <-- before you type anything
        mainPage.getChildren().add(textFieldMessage1);

        textFieldMessage2 = new TextField();
        textFieldMessage2.setLayoutX(20);
        textFieldMessage2.setLayoutY(140);
        textFieldMessage2.setPrefWidth(220);
        textFieldMessage2.setPromptText("Enter Author name");
        mainPage.getChildren().add(textFieldMessage2);


        textFieldMessage3 = new TextField();
        textFieldMessage3.setLayoutX(20);
        textFieldMessage3.setLayoutY(180);
        textFieldMessage3.setPrefWidth(220);
        textFieldMessage3.setPromptText("Enter Genre");
        mainPage.getChildren().add(textFieldMessage3);

        VBox menu = new VBox();

        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("My Books");
        MenuItem profileItem2 = new MenuItem("My Details");
        MenuItem profileItem3 = new MenuItem("Logout");
        profileMenu.getItems().addAll(profileItem1, profileItem2, profileItem3);

        myMenu.getMenus().addAll(profileMenu);
        mainPage.getChildren().add(myMenu);


        profileItem2.setOnAction((ActionEvent ae) -> Scene4.launch(stage, parentScene,scene ));
        profileItem3.setOnAction((ActionEvent ae) -> stage.setScene(scene));
        stage.setScene(scene2);

        Button homeButton = new Button();
        homeButton.setId("homeButton");
        homeButton.setLayoutX(105);
        homeButton.setLayoutY(1);
        //homeButton.setOnAction((ActionEvent ae) -> refreshPage));
        mainPage.getChildren().add(homeButton);

    }


    public static void refreshPage(ActionEvent ae){



    }

    //public static void doSomething(ActionEvent ae) {
        //Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //alert.setTitle("Information Dialog");
        //alert.setHeaderText(null);
        //alert.setContentText("No database of books yet!");
        //alert.showAndWait();
    }


