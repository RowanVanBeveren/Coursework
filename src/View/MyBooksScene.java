package View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 * Created by Rowan on 03-Nov-17.
 */
public class MyBooksScene { // (View.MyBooksScene = My Books pages)

    public static Scene prepareScene() {

        Pane booksPane = new Pane();
        Scene scene = new Scene(booksPane, 1024, 768);

        return scene;
    }
}
