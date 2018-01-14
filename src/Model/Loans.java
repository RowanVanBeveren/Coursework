package Model;

public class Loans {

    private int bookID;
    private int memberID;
    private java.sql.Date dateOut;
    private java.sql.Date dateIn;

    public Loans(int bookID, int memberID, java.sql.Date dateOut, java.sql.Date dateIn){

        this.bookID = bookID;
        this.memberID = memberID;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public java.sql.Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(java.sql.Date dateOut) {
        this.dateOut = dateOut;
    }

    public java.sql.Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(java.sql.Date dateIn) {
        this.dateIn = dateIn;
    }
}
