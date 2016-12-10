package de.hska.iwi.oauth.resource.controller;

import de.hska.iwi.oauth.resource.Book;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  Jakob Fels
 */
@RestController
public class BookController {

    @RequestMapping("/books")
    public Resource<Book> books() {
        return new Resource<>(Book.defaultBook());
    }
}

