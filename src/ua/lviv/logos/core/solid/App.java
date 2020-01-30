package ua.lviv.logos.core.solid;

import ua.lviv.logos.core.solid.nosolid.Author;
import ua.lviv.logos.core.solid.nosolid.Book;

public class App {

    public static void main(String[] args) {
                Author bob = new Author("Bob", "Martin");
                Author king = new Author("Stiven", "King");

                Author [] authors = new Author[2];
                authors[0] = bob;
                authors[1] = king;

                Book book = new Book("Super book", authors, "Book text ...");

                book.convertToPdf();
                book.printBook();
                book.save();
    }

}
