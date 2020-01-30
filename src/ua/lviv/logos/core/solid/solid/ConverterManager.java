package ua.lviv.logos.core.solid.solid;

import ua.lviv.logos.core.solid.solid.converter.BookConverter;
import ua.lviv.logos.core.solid.solid.model.Book;

public class ConverterManager {

    private BookConverter converter;

    public ConverterManager(BookConverter converter) {
        this.converter = converter;
    }

    public void convertBook(Book book) {
        converter.convert(book);
    }
}
