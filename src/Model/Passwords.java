package Model;

public class Passwords {

    private int passwordId;
    private String password;

    public Passwords(int passwordId, String password){
        this.passwordId = passwordId;
        this.password= password;
    }

    public int getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(int passwordId) {
        this.passwordId = passwordId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
