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
public class Scene4 { // (View.Scene4 = My Details Pages)

    private static Scene scene;

    public static void launch(Stage stage, Scene parentScene, Scene grandparentScene){


        scene = grandparentScene;

        Pane mainPage = new Pane();
        Scene scene4 = new Scene(mainPage, 1024, 768);
        scene4.getStylesheets().add("Resources/style.css");


        VBox menu = new VBox();
        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("My Books");
        MenuItem profileItem2 = new MenuItem("My Details");
        MenuItem profileItem3 = new MenuItem("Logout");
        profileMenu.getItems().addAll(profileItem1, profileItem2, profileItem3);

        myMenu.getMenus().addAll(profileMenu);
        mainPage.getChildren().add(myMenu);

        profileItem3.setOnAction((ActionEvent ae) -> stage.setScene(scene));
        stage.setScene(scene4);

        Button myButton = new Button("Search");
        myButton.setLayoutX(20);
        myButton.setLayoutY(220);
        myButton.setOnAction((ActionEvent ae) -> Scene3.launch(stage, parentScene, scene));
        mainPage.getChildren().add(myButton);


    }
}
