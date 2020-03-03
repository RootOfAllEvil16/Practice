package oop.Library;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private String bindingType;

    /*public Book(String title, String author, String publishingHouse, int year, int pages, double price, String bindingType) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year &&
                pages == book.pages &&
                Double.compare(book.price, price) == 0 &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publishingHouse.equals(book.publishingHouse) &&
                bindingType.equals(book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingHouse, year, pages, price, bindingType);
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}