package View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class LibrarianScene {

    public static Scene prepareScene(){

        Pane LibrarianPage = new Pane();
        Scene scene = new Scene(LibrarianPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        Text pageTitle = new Text();
        pageTitle.setText("Librarian page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(100);
        LibrarianPage.getChildren().add(pageTitle);



        return scene;
    }
}
