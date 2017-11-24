package View;

import Controller.DetailsController;
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
public class DetailsScene { // (View.DetailsScene = My Details Pages)

    public static Scene prepareStage() {

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

        myMenu.getMenus().addAll(profileMenu);
        mainPage.getChildren().add(myMenu);

        profileItem3.setOnAction((ae) -> DetailsController.goBackToLogin());

        Button myButton = new Button("Search");
        myButton.setLayoutX(20);
        myButton.setLayoutY(220);
        myButton.setOnAction((ae) -> DetailsController.search());

        mainPage.getChildren().add(myButton);

        return scene;

    }
}
