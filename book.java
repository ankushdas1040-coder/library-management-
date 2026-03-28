public class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void display() {
        System.out.println(id + " | " + title + " | " + author + " | " + (isIssued ? "Issued" : "Available"));
    }
}
