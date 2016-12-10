package de.hska.iwi.oauth.resource;


import org.springframework.hateoas.ResourceSupport;

public class Book extends ResourceSupport {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public static Book defaultBook() {
        return new Book("Inferno", "Dan Brown");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
