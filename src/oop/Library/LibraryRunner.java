package oop.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = createLibrary();
        System.out.println("Books by author are: " + library.findByAuthor("First"));
        System.out.println("Books by publishing house are: " + library.findByPublishingHouse("2"));
        System.out.println("Books published after year: " + library.publishedAfterYear(1974));

    }
    private static Library createLibrary(){
        Book book1 = new Book();
        book1.setTitle("One");
        book1.setAuthor("First");
        book1.setYear(1975);
        book1.setBindingType("soft");
        book1.setPages(250);
        book1.setPrice(45.5);
        book1.setPublishingHouse("1");


        Book book2 = new Book();
        book2.setTitle("Two");
        book2.setAuthor("Second");
        book2.setYear(2000);
        book2.setBindingType("hard");
        book2.setPages(300);
        book2.setPrice(100);
        book2.setPublishingHouse("2");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        return library;
    }
}
