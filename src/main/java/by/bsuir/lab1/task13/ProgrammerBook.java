package by.bsuir.lab1.task13;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook() {
        super();
        this.language = "Not specified";
        this.level = 0;
    }

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        return level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() + language.hashCode() * 13 + level * 17) % 1073676287;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }
}
