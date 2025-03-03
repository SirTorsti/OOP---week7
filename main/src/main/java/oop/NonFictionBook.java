package oop;

public class NonFictionBook extends Book{
    
    public NonFictionBook(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    public String categorize() {
        return "Tietokirja";
    }
}
