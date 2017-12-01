package Controller;

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
}
