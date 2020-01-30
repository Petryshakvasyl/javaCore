package ua.lviv.logos.core.solid.nosolid;

import java.util.Arrays;

public class Book {

    private String name;

    private Author[] authors;

    private String text;

    public Book(String name, Author[] authors, String text) {
        this.name = name;
        this.authors = authors;
        this.text = text;
    }

    public void printBook() {
        System.out.println("Book name: " + name);
        System.out.println("Book authors: " + Arrays.toString(authors));
        System.out.println("Book tex: " + text);
    }

    public void save() {
        System.out.println("book was saved");
    }

    public void convertToPdf() {
        System.out.println("Converted to pdf");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
