package by.bsuir.lab1.task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void checkOnNormalBook() {
        Book book = new Book("ABC", "ALEXEI BOBRIK", 1000000);
        assertEquals(book, book.clone());
    }
}