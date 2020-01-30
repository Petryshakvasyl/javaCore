package ua.lviv.logos.core.solid.solid.converter;

import ua.lviv.logos.core.solid.solid.model.Book;

public class PdfConverter implements BookConverter {

    @Override
    public void convert(Book book) {
        System.out.println("Convert to pdf");
    }
}
