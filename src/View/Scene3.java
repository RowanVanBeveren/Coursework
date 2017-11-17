package View;

import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Rowan on 03-Nov-17.
 */
public class Scene3 { // (View.Scene3 = Search page)

    private static Scene scene;

    public static void launch(Stage stage, Scene parentScene, Scene grandparentScene) {

        scene = grandparentScene;

        Pane mainPage = new Pane();
        Scene scene3 = new Scene(mainPage, 1024, 768);
        scene3.getStylesheets().add("Resources/style.css");


        VBox menu = new VBox();
        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("My Books");
        MenuItem profileItem2 = new MenuItem("My Details");
        MenuItem profileItem3 = new MenuItem("Logout");
        profileMenu.getItems().addAll(profileItem1, profileItem2, profileItem3);

        myMenu.getMenus().addAll(profileMenu);
        mainPage.getChildren().add(myMenu);

        profileItem2.setOnAction((ActionEvent ae) -> Scene4.launch(stage, parentScene,scene ));//launches the My details page
        profileItem3.setOnAction((ActionEvent ae) -> stage.setScene(scene));
        stage.setScene(scene3);

        Button homeButton = new Button("");
        homeButton.setId("homeButton");
        homeButton.setLayoutX(105);
        homeButton.setLayoutY(1);

        homeButton.setOnAction((ActionEvent ae) -> Scene2.launch(stage, parentScene));
        mainPage.getChildren().add(homeButton);
    }
}
