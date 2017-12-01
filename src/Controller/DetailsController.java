package Controller;

public class DetailsController {

    public static void goHome() {
        Master.masterStage.setScene(Master.mainScene);
    }


    public static void search(){
        Master.masterStage.setScene(Master.searchScene);
    }

    //Menu tab
    public static void goToMyBooks(){
        Master.masterStage.setScene(Master.myBooksScene);
    }

    public static void goToDetails() {
        Master.masterStage.setScene(Master.detailsScene);
    }
    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

}
