/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management;

import java.util.ArrayList;
import library_management.documents.Document;
import library_management.users.User;

public class Library {
    private ArrayList<Document> documents;
    private ArrayList<User> users;

    public Library() {
        this.documents = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addDocument(Document doc) {
        documents.add(doc);
    }

    public void removeDocument(Document doc) {
        documents.remove(doc);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    // Các phương thức khác cho việc tìm kiếm và quản lý tài liệu, người dùng
}
