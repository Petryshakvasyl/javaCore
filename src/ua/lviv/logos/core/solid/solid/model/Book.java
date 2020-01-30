package ua.lviv.logos.core.solid.solid.model;

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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", text='" + text + '\'' +
                '}';
    }
}
