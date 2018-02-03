package Controller;

import javafx.scene.control.Alert;

public class MyBooksController {

    public static void goHome() {
        Master.masterStage.setScene(Master.mainScene);
    }

    public static void searchAgain() {
        Master.masterStage.setScene(Master.searchScene);
    }

    //Menu tab

    public static void goToMyBooks(){
        Master.masterStage.setScene(Master.myBooksScene);
    }

    public static void goToDetails() {
        Master.masterStage.setScene(Master.detailsScene);
    }


    public static void goBackToLogin() {
        Master.masterStage.setScene(Master.loginScene);
    }

    public static void searchAlert(){
        Alert noSearch = new Alert(Alert.AlertType.ERROR);
        noSearch.setTitle("Nothing searched");
        noSearch.setHeaderText("Nothing in search box");
        noSearch.setContentText("Nothing searched please enter in a book name or author");
        noSearch.showAndWait();
    }
}

