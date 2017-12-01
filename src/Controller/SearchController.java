package Controller;

public class SearchController {

    public static void goHome(){
        Master.masterStage.setScene(Master.mainScene);
    }

    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

    public static void goToDetails(){
        Master.masterStage.setScene(Master.detailsScene);
    }

    public static void searchAgain(){
        Master.masterStage.setScene(Master.searchScene);
    }

}
