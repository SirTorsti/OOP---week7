package oop;
public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;

    public void displayInfo() {
        System.out.println("Nimi: " + title);
        System.out.println("Kirjailija " + author);
        System.out.println("Sivut: " + pages);
        System.out.println("Määrä: " + copies);
    }
    public abstract String categorize();
}
