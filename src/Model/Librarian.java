package Model;

public class Librarian {

    private int id;
    private String firstName;
    private String surname;
    private String Rank;
    private int passwordId;
    private int userNameId;

    public Librarian(int id, String firstName, String surname, String Rank, int passwordId, int userNameId){
        this.id;
        this.firstName;
        this.surname;
        this.Rank;
        this.passwordId;
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
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
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
