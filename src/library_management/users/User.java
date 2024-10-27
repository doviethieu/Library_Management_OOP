/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management.users;

import java.util.ArrayList;
import library_management.documents.Document;

public class User {
    protected String name;
    protected String memberId;
    protected ArrayList<Document> borrowedDocuments;

    public User(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedDocuments = new ArrayList<>();
    }

    public void borrowDocument(Document doc) {
        borrowedDocuments.add(doc);
    }

    public void returnDocument(Document doc) {
        borrowedDocuments.remove(doc);
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public ArrayList<Document> getBorrowedDocuments() {
        return borrowedDocuments;
    }
}
