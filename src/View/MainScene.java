package View;

import Controller.MainSceneController;
import Controller.Master;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;



/**
 * Created by Rowan on 03-Nov-17.
 *

 */
public class MainScene { // (View.mainScene = View.LoginScene page)



    //private static TextField textFieldMessage2;
    //private static TextField textFieldMessage3;

    public static Scene prepareScene() {

        Pane mainPage = new Pane();
        Scene scene = new Scene(mainPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        Button searchButton = new Button();
        searchButton.setId("searchButton");
        searchButton.setLayoutX(330);
        searchButton.setLayoutY(0);
        searchButton.setOnAction((ae) -> MainSceneController.search());
        mainPage.getChildren().add(searchButton);


        Master.textFieldMessage1 = new TextField();//adds a box that you are able to write a message in
        Master.textFieldMessage1.setLayoutX(110);
        Master.textFieldMessage1.setLayoutY(0);
        Master.textFieldMessage1.setPrefWidth(220);
        Master.textFieldMessage1.setPromptText("Search");// sets the text to <-- before you type anything
        mainPage.getChildren().add(Master.textFieldMessage1);

        Master.textFieldMessage1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)){
                    MainSceneController.search();

                }

            }
        });

        //textFieldMessage2 = new TextField();
        //textFieldMessage2.setLayoutX(20);
        //textFieldMessage2.setLayoutY(140);
        //textFieldMessage2.setPrefWidth(220);
        //textFieldMessage2.setPromptText("Enter Author name");
       // mainPage.getChildren().add(textFieldMessage2);


     //   textFieldMessage3 = new TextField();
       // textFieldMessage3.setLayoutX(20);
       // textFieldMessage3.setLayoutY(180);
        //textFieldMessage3.setPrefWidth(220);
        //textFieldMessage3.setPromptText("Enter Genre");
        //mainPage.getChildren().add(textFieldMessage3);

        VBox menu = new VBox();

        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("My Books");
        MenuItem profileItem2 = new MenuItem("My Details");
        MenuItem profileItem3 = new MenuItem("Logout");
        profileMenu.getItems().addAll(profileItem1, profileItem2, profileItem3);

        myMenu.getMenus().addAll(profileMenu);
        mainPage.getChildren().add(myMenu);

        profileItem1.setOnAction((ae) -> MainSceneController.goToMyBooks());
        profileItem2.setOnAction((ae) -> MainSceneController.goToMyDetails());
        profileItem3.setOnAction((ae) -> MainSceneController.goBackToLogin());


        Button homeButton = new Button();
        homeButton.setId("homeButton");
        homeButton.setLayoutX(80);
        homeButton.setLayoutY(0);
        homeButton.setOnAction((ae) -> MainSceneController.refresh());
        mainPage.getChildren().add(homeButton);

        Text pageTitle = new Text();
        pageTitle.setText("Main Page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(100);
        mainPage.getChildren().add(pageTitle);

        return scene;

    }

}