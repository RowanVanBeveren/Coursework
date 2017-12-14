package Controller;

public class SearchController {

    public static void goHome(){
        Master.masterStage.setScene(Master.mainScene);
    }

    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

    //Menu tab
    public static void goToMyBooks(){
        Master.masterStage.setScene(Master.myBooksScene);
    }

    public static void goToDetails(){
        Master.masterStage.setScene(Master.detailsScene);
    }

    public static void searchAgain(){
        Master.masterStage.setScene(Master.searchScene);
    }

}
