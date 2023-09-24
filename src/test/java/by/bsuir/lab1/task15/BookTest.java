package by.bsuir.lab1.task15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void checkOnSingleBook() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Biba and boba", "Alexus", 59, 19)
        ));
        List<Book> expected = List.of(
                new Book("Biba and boba", "Alexus", 59, 19)
        );
        Collections.sort(books);
        assertEquals(expected, books);
    }

    @Test
    void checkOnManyBooks() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Biba and boba", "Alexus", 59, 19),
                new Book("Biba and boba1", "Alexus1", 35, 542),
                new Book("Biba and boba2", "Alexus2", 1, 24)
        ));
        List<Book> expected = List.of(
                new Book("Biba and boba", "Alexus", 59, 19),
                new Book("Biba and boba2", "Alexus2", 1, 24),
                new Book("Biba and boba1", "Alexus1", 35, 542)
        );
        Collections.sort(books);
        assertEquals(expected, books);
    }
}