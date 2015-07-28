package com.twu.biblioteca;

public class Book {
    private String bookName;
    private String bookAuthor;
    private int yearPublished;

    public Book(String bookName, String bookAuthor, int yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Book thatBook = (Book) other;

        if (yearPublished != thatBook.yearPublished) return false;
        if (bookName != null ? !bookName.equals(thatBook.bookName) : thatBook.bookName != null) return false;
        return !(bookAuthor != null ? !bookAuthor.equals(thatBook.bookAuthor) : thatBook.bookAuthor != null);

    }

    @Override
    public String toString() {
        return bookName + " " + bookAuthor + " " + yearPublished;
    }

    @Override
    public int hashCode() {
        int result = bookName != null ? bookName.hashCode() : 0;
        result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
        result = 31 * result + yearPublished;
        return result;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
