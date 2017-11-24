package Controller;

public class MainSceneController {

    public static void search(){
        Master.masterStage.setScene(Master.searchScene);
    }

    public static void goBackToLogin(){
        Master.masterStage.setScene(Master.loginScene);
    }

}
