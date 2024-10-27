/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management.documents;

public class Book extends Document {
    private String publisher;

    public Book(String title, String author, String genre, int quantity, String publisher) {
        super(title, author, genre, quantity);
        this.publisher = publisher;
    }

    @Override
    public void printInfo() {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Publisher: " + publisher);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}