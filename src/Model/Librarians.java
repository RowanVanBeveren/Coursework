package Model;

public class Librarians {

    private int id;
    private String firstName;
    private String surname;
    private String rank;
    private int passwordId;
    private int userNameId;

    public Librarians(int id, String firstName, String surname, String rank, int passwordId, int userNameId){
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.rank = rank;
        this.passwordId = passwordId;
        this.userNameId = userNameId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        rank = rank;
    }

    public int getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(int passwordId) {
        this.passwordId = passwordId;
    }

    public int getUserNameId() {
        return userNameId;
    }

    public void setUserNameId(int userNameId) {
        this.userNameId = userNameId;
    }
}
