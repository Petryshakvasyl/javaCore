package ua.lviv.logos.core.solid.solid.badconverters;

import ua.lviv.logos.core.solid.solid.model.Book;

public interface BadBookConverter {
    //
    //    public void convertToPdf(Book book) {
    //        System.out.println("I am converting to pdf .. "+ book);
    //    }

    void convert(Book book, String type);
}
