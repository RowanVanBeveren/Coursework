package View;

import Controller.DetailsController;

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
 */
public class DetailsScene { // (View.DetailsScene = My Details Pages)



    public static Scene prepareStage() {

        Pane detailsPage = new Pane();
        Scene scene = new Scene(detailsPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        VBox menu = new VBox();
        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("My Books");
        MenuItem profileItem2 = new MenuItem("My Details");
        MenuItem profileItem3 = new MenuItem("Logout");
        profileMenu.getItems().addAll(profileItem1, profileItem2, profileItem3);

        myMenu.getMenus().addAll(profileMenu);
        detailsPage.getChildren().add(myMenu);

        profileItem1.setOnAction((ae) -> DetailsController.goToMyBooks());
        profileItem2.setOnAction((ae) -> DetailsController.goToDetails());
        profileItem3.setOnAction((ae) -> DetailsController.goBackToLogin());

        Button homeButton = new Button();
        homeButton.setId("homeButton");
        homeButton.setLayoutX(80);
        homeButton.setLayoutY(0);
        homeButton.setOnAction((ae) -> DetailsController.goHome());
        detailsPage.getChildren().add(homeButton);

        Master.textFieldMessage1 = new TextField();//adds a box that you are able to write a message in
        Master.textFieldMessage1.setLayoutX(110);
        Master.textFieldMessage1.setLayoutY(0);
        Master.textFieldMessage1.setPrefWidth(220);
        Master.textFieldMessage1.setPromptText("Search");// sets the text to <-- before you type anything
        detailsPage.getChildren().add(Master.textFieldMessage1);


        Button searchButton = new Button();
        searchButton.setId("searchButton");
        searchButton.setLayoutX(330);
        searchButton.setLayoutY(0);
        searchButton.setOnAction((ae) -> DetailsController.search());
        detailsPage.getChildren().add(searchButton);

        Text pageTitle = new Text();
        pageTitle.setText("Details Page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(220);
        detailsPage.getChildren().add(pageTitle);

        Master.textFieldMessage1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)){
                    DetailsController.search();

                }

            }
        });
        /*if(searchBarDetails.getText().equals("")){
        DetailsController.searchAlert();
        }*/
        return scene;

    }
}
