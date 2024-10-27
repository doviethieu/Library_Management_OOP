/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management.documents;

public class Thesis extends Document {
    private String advisor;

    public Thesis(String title, String author, String genre, int quantity, String advisor) {
        super(title, author, genre, quantity);
        this.advisor = advisor;
    }

    @Override
    public void printInfo() {
        System.out.println("Thesis Title: " + title + ", Author: " + author + ", Advisor: " + advisor);
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }
}
