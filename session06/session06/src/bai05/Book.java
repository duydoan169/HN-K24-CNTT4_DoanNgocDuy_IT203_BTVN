package bai05;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
