package oop;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    };

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kirja lisätty kirjastoon!");
    };

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void listBooks() {
        int totalBooks = 0;
        for (Book book : books) {
            book.displayInfo();
            if(book instanceof FictionBook) {
                System.out.println("Kirjan kategoria: " + ((FictionBook) book).categorize());
            } else if (book instanceof NonFictionBook) {
                System.out.println("Kirjan kategoria: " + ((NonFictionBook) book).categorize());
            }
            totalBooks += book.copies;
        }
        System.out.println("Kirjojen määrä kirjastossa on: " + totalBooks);
    };


}
