package Model;

public class Member {

    private int id;
    private String firstName;
    private String surname;
    private String town;
    private String county;
    private String postcode;
    private String email;
    private int passwordId;
    private int userNameId;

    public Member(  int id, String firstName, String surname, String town, String county, String postcode, String email, int passwordId, int userNameId){

          this.id;
          this.firstName;
          this.surname;
          this.town;
          this.county;
          this.postcode;
          this.email;
          this.passwordId;
          this.userNameId;

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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
