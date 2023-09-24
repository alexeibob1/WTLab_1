package by.bsuir.lab1.task16;

import by.bsuir.lab1.task16.comparators.AuthorComparator;
import by.bsuir.lab1.task16.comparators.PriceComparator;
import by.bsuir.lab1.task16.comparators.TitleComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSorterTest {

    @Test
    void checkSortingByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Biba and boba", "Alexus", 59),
                new Book("Biba and boba2", "Alexus2", 1),
                new Book("Biba and boba1", "Alexus1", 35)
        ));
        List<Book> expected = List.of(
                new Book("Biba and boba", "Alexus", 59),
                new Book("Biba and boba1", "Alexus1", 35),
                new Book("Biba and boba2", "Alexus2", 1)
        );
        BookSorter.sortByTitle(books);
        assertEquals(expected, books);
    }

    @Test
    void checkSortingByTitleAuthor() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Biba and boba", "Alexus2", 59),
                new Book("Biba and boba2", "Alexus1", 1),
                new Book("Biba and boba1", "Alexus3", 35),
                new Book("Biba and boba1", "Alexus0", 35)
        ));
        List<Book> expected = List.of(
                new Book("Biba and boba", "Alexus2", 59),
                new Book("Biba and boba1", "Alexus0", 35),
                new Book("Biba and boba1", "Alexus3", 35),
                new Book("Biba and boba2", "Alexus1", 1)
        );
        BookSorter.sortByTitleAuthor(books);
        assertEquals(expected, books);
    }

    @Test
    void checkSortingByAuthorTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Biba and boba", "Alexus2", 59),
                new Book("Biba and boba2", "Alexus1", 1),
                new Book("Biba and boba1", "Alexus3", 35),
                new Book("Biba and boba1", "Alexus0", 35),
                new Book("Biba and boba0", "Alexus3", 35)
        ));
        List<Book> expected = List.of(
                new Book("Biba and boba1", "Alexus0", 35),
                new Book("Biba and boba2", "Alexus1", 1),
                new Book("Biba and boba", "Alexus2", 59),
                new Book("Biba and boba0", "Alexus3", 35),
                new Book("Biba and boba1", "Alexus3", 35)
        );
        BookSorter.sortByAuthorTitle(books);
        assertEquals(expected, books);
    }

    @Test
    void checkSortingByAuthorTitlePrice() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Biba and boba", "Alexus2", 59),
                new Book("Biba and boba2", "Alexus1", 1),
                new Book("Biba and boba0", "Alexus3", 28),
                new Book("Biba and boba1", "Alexus0", 17),
                new Book("Biba and boba0", "Alexus3", 35)
        ));
        List<Book> expected = List.of(
                new Book("Biba and boba1", "Alexus0", 17),
                new Book("Biba and boba2", "Alexus1", 1),
                new Book("Biba and boba", "Alexus2", 59),
                new Book("Biba and boba0", "Alexus3", 28),
                new Book("Biba and boba0", "Alexus3", 35)
        );
        BookSorter.sortByAuthorTitlePrice(books);
        assertEquals(expected, books);
    }
}