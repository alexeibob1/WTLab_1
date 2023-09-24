package by.bsuir.lab1.task15;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book() {
        this.title = "Untitled";
        this.author = "Is not specified";
        this.isbn = 0;
        this.price = 0;
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        return (71 * title.hashCode() + 83 * author.hashCode() + Integer.valueOf(price).hashCode() * 199) % 1073676287;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        if (obj.hashCode() != this.hashCode()) {
            return false;
        }

        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString() {
        return "Title:" + title + "|Author:" + author + "|Price:" + price + "|Edition:" + edition;
    }

    @Override
    public int compareTo(Book obj) {
        return this.isbn - obj.isbn;
    }
}