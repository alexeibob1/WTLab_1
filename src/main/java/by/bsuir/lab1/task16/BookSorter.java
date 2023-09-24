package by.bsuir.lab1.task16;

import by.bsuir.lab1.task16.comparators.AuthorComparator;
import by.bsuir.lab1.task16.comparators.PriceComparator;
import by.bsuir.lab1.task16.comparators.TitleComparator;

import java.util.Comparator;
import java.util.List;

public class BookSorter {
    public static void sortByTitle(List<Book> books) {
        Comparator<Book> comparator = new TitleComparator();
        books.sort(comparator);
    }

    public static void sortByTitleAuthor(List<Book> books) {
        Comparator<Book> comparator = new TitleComparator()
                .thenComparing(new AuthorComparator());
        books.sort(comparator);
    }

    public static void sortByAuthorTitle(List<Book> books) {
        Comparator<Book> comparator = new AuthorComparator()
                .thenComparing(new TitleComparator());
        books.sort(comparator);
    }

    public static void sortByAuthorTitlePrice(List<Book> books) {
        Comparator<Book> comparator = new AuthorComparator()
                .thenComparing(new TitleComparator())
                .thenComparing(new PriceComparator());
        books.sort(comparator);
    }
}
