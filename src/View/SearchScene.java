package View;

import Controller.SearchController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * Created by Rowan on 03-Nov-17.
 */
public class SearchScene {

    public static Scene prepareScene() {

        Pane mainPage = new Pane();
        Scene scene = new Scene(mainPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        VBox menu = new VBox();
        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("My Books");
        MenuItem profileItem2 = new MenuItem("My Details");
        MenuItem profileItem3 = new MenuItem("Logout");
        profileMenu.getItems().addAll(profileItem1, profileItem2, profileItem3);

        profileItem2.setOnAction((ae) -> SearchController.goToDetails());

        myMenu.getMenus().addAll(profileMenu);
        mainPage.getChildren().add(myMenu);

        profileItem3.setOnAction((ae) -> SearchController.goBackToLogin());

        Button homeButton = new Button("");
        homeButton.setId("homeButton");
        homeButton.setLayoutX(105);
        homeButton.setLayoutY(1);

        homeButton.setOnAction((ae) -> SearchController.goHome());
        mainPage.getChildren().add(homeButton);

        return scene;

    }
}
