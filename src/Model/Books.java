package Model;

public class Books {

    private int id;
    private String name;
    private int publisherId;
    private String genre;
    private int authorId;

    public Books(int id, String name, int publisherId, String genre, int authorId) {
        this.id = id;
        this.name = name;
        this.publisherId = publisherId;
        this.genre = genre;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisherId=" + publisherId +
                ", genre='" + genre + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
