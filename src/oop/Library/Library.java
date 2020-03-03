package oop.Library;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Library findByAuthor(String author) {
        Library result = new Library();
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                result.addBook(book);
            }
        }
        return result;
    }

    public Library findByPublishingHouse(String publishingHouse) {
        Library result = new Library();
        for (Book book : books) {
            if (publishingHouse.equals(book.getPublishingHouse())) {
                result.addBook(book);
            }
        }
        return result;
    }

    public Library publishedAfterYear(int year) {
        Library result = new Library();
        for (Book book : books) {
            if (book.getYear() >= year) {
                result.addBook(book);
            }
        }
        return result;
    }

    /* @Override
     public String toString() {
         return "Library{" +
                 "books=" + books +
                 '}';
     }*/
    @Override
    public String toString() {
        return books.toString();
    }
}
