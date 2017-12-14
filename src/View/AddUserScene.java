package View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class AddUserScene {

    public static Scene prepareScene(){

        Pane addUserPage = new Pane();
        Scene scene = new Scene(addUserPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        Text pageTitle = new Text();
        pageTitle.setText("New User Page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(100);
        addUserPage.getChildren().add(pageTitle);


        return scene;


    }

}
