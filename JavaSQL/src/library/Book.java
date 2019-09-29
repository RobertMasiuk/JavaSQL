package library;

/**
 *
 * @author Robert
 */
public class Book {
    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitile() {
        return title;
    }
    public void setTitle(String tytul) {
        this.title = tytul;
    }
    public String getAutor() {
        return author;
    }
    public void setAutor(String autor) {
        this.author = author;
    }

    public Book() {}
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "["+id+"] - "+title+" - "+author;
    }
}
