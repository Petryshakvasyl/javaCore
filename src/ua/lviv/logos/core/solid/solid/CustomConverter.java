package ua.lviv.logos.core.solid.solid;

import ua.lviv.logos.core.solid.solid.converter.BookConverter;
import ua.lviv.logos.core.solid.solid.model.Book;

public class CustomConverter implements BookConverter {

    @Override
    public void convert(Book book) {
        System.out.println("Custom convert ...");
    }
}
