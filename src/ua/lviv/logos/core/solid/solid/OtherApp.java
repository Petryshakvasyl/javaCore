package ua.lviv.logos.core.solid.solid;


import ua.lviv.logos.core.solid.solid.converter.BookConverter;
import ua.lviv.logos.core.solid.solid.model.Author;
import ua.lviv.logos.core.solid.solid.model.Book;

public class OtherApp {

    public static void main(String[] args) {
        BookConverter converter = getConverter();
        ConverterManager manager = new ConverterManager(converter);
        Book book = creteBook();
        manager.convertBook(book);
    }

    private static BookConverter getConverter() {
        return new CustomConverter();
    }

    public static Book creteBook() {
        Author bob = new Author("Bob", "Martin");
        Author king = new Author("Stiven", "King");

        Author[] authors = new Author[2];
        authors[0] = bob;
        authors[1] = king;

        return new Book("Super book", authors, "Book text ...");
    }

}
