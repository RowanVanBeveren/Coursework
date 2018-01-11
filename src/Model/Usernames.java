package Model;

public class Usernames {
    private int userNameId;
    private String userName;

    public Usernames(int userNameId, String userName){
        this.userNameId = userNameId;
        this.userName = userName;
    }

    public int getUserNameId() {
        return userNameId;
    }

    public void setUserNameId(int userNameId) {
        this.userNameId = userNameId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
