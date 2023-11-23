package memento;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public MementoBook createMemento() {
        return new MementoBook(this);
    }

    public void restoreToMemento(MementoBook memento) {
        this.name = memento.getName();
        this.author = memento.getAuthor();
    }

    public void printBook() {
        String string1 = "Name= " + this.name + " - Author = " + this.author;
        System.out.println(string1);
    }
}