package Controller;

import javafx.scene.control.Alert;

public class MainSceneController {

    public static void search(){
        Master.masterStage.setScene(Master.searchScene);
    }

    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

    public static void goToMyDetails(){
        Master.masterStage.setScene(Master.detailsScene);
    }

    public static void goToMyBooks(){
        Master.masterStage.setScene(Master.myBooksScene);
    }

    public static void refresh(){
        Master.masterStage.setScene(Master.mainScene);
    }

    public static void searchAlert(){
        Alert noSearch = new Alert(Alert.AlertType.ERROR);
        noSearch.setTitle("Nothing searched");
        noSearch.setHeaderText("Nothing in search box");
        noSearch.setContentText("Nothing searched please enter in a book name or author");
        noSearch.showAndWait();
    }
}
