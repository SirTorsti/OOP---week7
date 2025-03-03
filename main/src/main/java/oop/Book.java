package oop;
public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;

    public void displayInfo() {
        System.out.println("Nimi: " + title + "\nKirjailija: " + author + "\nSivut: " + pages + "\nMäärä: " + copies);
    }
}
