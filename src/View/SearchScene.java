package View;

import Controller.SearchController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * Created by Rowan on 03-Nov-17.
 */
public class SearchScene {
    private static TextField textFieldMessage1;

    public static Scene prepareScene() {

        Pane searchPage = new Pane();
        Scene scene = new Scene(searchPage, 1024, 768);
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
        searchPage.getChildren().add(myMenu);

        profileItem3.setOnAction((ae) -> SearchController.goBackToLogin());

        Button homeButton = new Button("");
        homeButton.setId("homeButton");
        homeButton.setLayoutX(80);
        homeButton.setLayoutY(0);

        homeButton.setOnAction((ae) -> SearchController.goHome());
        searchPage.getChildren().add(homeButton);

        textFieldMessage1 = new TextField();//adds a box that you are able to write a message in
        textFieldMessage1.setLayoutX(110);
        textFieldMessage1.setLayoutY(0);
        textFieldMessage1.setPrefWidth(220);
        textFieldMessage1.setPromptText("Search");// sets the text to <-- before you type anything
        searchPage.getChildren().add(textFieldMessage1);

        Button searchButton = new Button();
        searchButton.setId("searchButton");
        searchButton.setLayoutX(330);
        searchButton.setLayoutY(0);
        searchButton.setOnAction((ae) -> SearchController.searchAgain());
        searchPage.getChildren().add(searchButton);

        Text pageTitle = new Text();
        pageTitle.setText("Search Page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(220);
        searchPage.getChildren().add(pageTitle);


        return scene;

    }
}
