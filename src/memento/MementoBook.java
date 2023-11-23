package memento;

public class MementoBook {
    private final String name;
    private final String author;

    public MementoBook(Book book) {
        this.name = book.getName();
        this.author = book.getAuthor();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
