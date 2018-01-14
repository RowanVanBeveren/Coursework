package Model;

public class Authors {

    private int authorID;
    private String author;


    public Authors(int authorID, String author){

        this.authorID = authorID;
        this.author = author;
    }


    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
