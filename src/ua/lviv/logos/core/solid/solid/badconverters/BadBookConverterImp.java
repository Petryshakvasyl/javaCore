package ua.lviv.logos.core.solid.solid.badconverters;

import ua.lviv.logos.core.solid.solid.model.Book;

public class BadBookConverterImp implements BadBookConverter {

    @Override
    public void convert(Book book, String type) {
        if (type == "pdf") {
            System.out.println("convert to pdf");
        } else if (type == "word") {
            System.out.println("convert to docx");
        } else if (type == "csv") {
            System.out.println("convert to csv ..");
        } else if (type == "new type") {
            System.out.println("convert to new type ..");
        } else {
            System.out.println("Do not convert ...");
        }
    }
}
