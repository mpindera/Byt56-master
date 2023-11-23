package memento;

public class Main {
    public static void main(String[] args) {
        Watchman watchman = new Watchman();

        Book book = new Book("Harry Potter", "J. K. Rowling");
        book.printBook();
        watchman.add(book.createMemento());

        book = new Book("James Bond", "Stephan King");
        book.printBook();
        watchman.add(book.createMemento());

        book.restoreToMemento(watchman.get(0));
        System.out.println("\nAfter Restore:");
        book.printBook();

    }
}
