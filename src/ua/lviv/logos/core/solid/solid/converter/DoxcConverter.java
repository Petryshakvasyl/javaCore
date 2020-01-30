package ua.lviv.logos.core.solid.solid.converter;


import ua.lviv.logos.core.solid.solid.model.Book;

public class DoxcConverter implements BookConverter {

    @Override
    public void convert(Book book) {
        System.out.println("convert to word");
    }
}
