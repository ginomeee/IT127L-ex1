/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ginoa
 */
public class Book {
    private String bookTitle;
    private Author name;
    private PubDate date;

    public Book(String bookTitle, Author name, PubDate date) {
        this.bookTitle = bookTitle;
        this.name = name;
        this.date = date;
    }
    public Book(){}

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public PubDate getDate() {
        return date;
    }

    public void setDate(PubDate date) {
        this.date = date;
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }
    
}
