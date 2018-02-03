package View;

import Controller.LibrarianController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class LibrarianScene {
    public static TextField title;
    public static TextField author;
    public static TextField publisher;

    public static Scene prepareScene(){

        Pane LibrarianPage = new Pane();
        Scene scene = new Scene(LibrarianPage, 1024, 768);
        scene.getStylesheets().add("Resources/style.css");

        Text pageTitle = new Text();
        pageTitle.setText("Librarian page");
        pageTitle.setLayoutX(0);
        pageTitle.setLayoutY(100);
        LibrarianPage.getChildren().add(pageTitle);


        MenuBar myMenu = new MenuBar();

        Menu profileMenu = new Menu("My Profile");
        MenuItem profileItem1 = new MenuItem("Logout");

        profileMenu.getItems().addAll(profileItem1);

        myMenu.getMenus().addAll(profileMenu);
        LibrarianPage.getChildren().add(myMenu);

        profileItem1.setOnAction((ae) -> LibrarianController.goBackToLogin());

        title = new TextField();//adds a box that you are able to write a message in
        title.setLayoutX(402);
        title.setLayoutY(260);
        title.setPrefWidth(220);
        title.setPromptText("Book Title");// sets the text to <-- before you type anything
        LibrarianPage.getChildren().add(title);

        author = new TextField();//adds a box that you are able to write a message in
        author.setLayoutX(402);
        author.setLayoutY(300);
        author.setPrefWidth(220);
        author.setPromptText("Author");// sets the text to <-- before you type anything
        LibrarianPage.getChildren().add(author);

        publisher = new TextField();//adds a box that you are able to write a message in
        publisher.setLayoutX(402);
        publisher.setLayoutY(340);
        publisher.setPrefWidth(220);
        publisher.setPromptText("Publisher");// sets the text to <-- before you type anything
        LibrarianPage.getChildren().add(publisher);


        Button addBook = new Button("Add book");
        addBook.setLayoutX(512);
        addBook.setLayoutY(384);
        LibrarianPage.getChildren().add(addBook);



        return scene;
    }
}
